package com.eventmanagement.dao;

import com.eventmanagement.db.DBConnection;
import com.eventmanagement.model.Event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventDAO {
    public void addEvent(Event event) throws SQLException {
        String sql = "INSERT INTO events (name, description, date, location) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, event.getName());
            stmt.setString(2, event.getDescription());
            stmt.setDate(3, new java.sql.Date(event.getDate().getTime()));
            stmt.setString(4, event.getLocation());
            stmt.executeUpdate();
        }
    }

    public List<Event> getAllEvents() throws SQLException {
        List<Event> events = new ArrayList<>();
        String sql = "SELECT * FROM events";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Event event = new Event();
                event.setEventId(rs.getInt("event_id"));
                event.setName(rs.getString("name"));
                event.setDescription(rs.getString("description"));
                event.setDate(rs.getDate("date"));
                event.setLocation(rs.getString("location"));
                events.add(event);
            }
        }
        return events;
    }
}