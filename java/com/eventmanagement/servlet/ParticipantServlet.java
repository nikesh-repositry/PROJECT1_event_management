package com.eventmanagement.servlet;

import com.eventmanagement.dao.ParticipantDAO;
import com.eventmanagement.model.Participant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/participants")
public class ParticipantServlet extends HttpServlet {
    private ParticipantDAO participantDAO;

    @Override
    public void init() throws ServletException {
        participantDAO = new ParticipantDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Participant> participants = participantDAO.getAllParticipants();
            request.setAttribute("participants", participants);
            request.getRequestDispatcher("participants.jsp").forward(request, response);
        } catch (SQLException e) {
            request.setAttribute("errorMessage", "Unable to retrieve participants: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Participant participant = new Participant();
        participant.setName(name);
        participant.setEmail(email);
        participant.setPhone(phone);

        try {
            participantDAO.addParticipant(participant);
            response.sendRedirect("participants");
        } catch (SQLException e) {
            request.setAttribute("errorMessage", "Unable to add participant: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}