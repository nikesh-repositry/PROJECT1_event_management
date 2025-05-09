package com.eventmanagement.servlet;

import com.eventmanagement.dao.EventDAO;
import com.eventmanagement.model.Event;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet("/events")
public class EventServlet extends HttpServlet {
    private EventDAO eventDAO;

    @Override
    public void init() throws ServletException {
        eventDAO = new EventDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Event> events = eventDAO.getAllEvents();
            request.setAttribute("events", events);
            request.getRequestDispatcher("/events.jsp").forward(request, response);
        } catch (Exception e) {
            throw new ServletException("Error retrieving events", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Event event = new Event();
            event.setName(request.getParameter("name"));
            event.setDescription(request.getParameter("description"));
            event.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date")));
            event.setLocation(request.getParameter("location"));
            eventDAO.addEvent(event);
            response.sendRedirect("events");
        } catch (Exception e) {
            throw new ServletException("Error adding event", e);
        }
    }
}