package com.eventmanagement.dao;

import com.eventmanagement.db.DBConnection;
import com.eventmanagement.model.Participant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParticipantDAO {
    public void addParticipant(Participant participant) throws SQLException {
        String sql = "INSERT INTO participants (name, email, phone) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, participant.getName());
            stmt.setString(2, participant.getEmail());
            stmt.setString(3, participant.getPhone());
            stmt.executeUpdate();
        }
    }

    public List<Participant> getAllParticipants() throws SQLException {
        List<Participant> participants = new ArrayList<>();
        String sql = "SELECT * FROM participants";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Participant participant = new Participant();
                participant.setParticipantId(rs.getInt("participant_id"));
                participant.setName(rs.getString("name"));
                participant.setEmail(rs.getString("email"));
                participant.setPhone(rs.getString("phone"));
                participants.add(participant);
            }
        }
        return participants;
    }
}