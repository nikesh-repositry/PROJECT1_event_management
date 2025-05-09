package com.niet.controller;

import com.niet.dao.EventDAO;
import com.niet.model.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EventController")
public class EventController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if("createEvent".equals(action)) {
            try {
                Event event = new Event();
                event.setEventId(request.getParameter("eventId"));
                event.setEventName(request.getParameter("eventName"));
                event.setEventDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("eventDate")));
                event.setLocation(request.getParameter("location"));
                
                EventDAO.createEvent(event);
                response.sendRedirect("events.jsp");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/events.jsp").forward(request, response);
    }
}