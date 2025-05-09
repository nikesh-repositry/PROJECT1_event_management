package com.niet.dao;

import com.niet.model.*;
import java.util.*;

public class EventDAO {
    private static Map<String, Event> events = new HashMap<>();
    private static List<Participation> participations = new ArrayList<>();
    private static List<Feedback> feedbacks = new ArrayList<>();
    private static List<Academic> academics = new ArrayList<>();
    
    // Event Methods
    public static void createEvent(Event event) {
        events.put(event.getEventId(), event);
    }
    
    public static List<Event> getAllEvents() {
        return new ArrayList<>(events.values());
    }
    
    // Participation Methods
    public static void addParticipation(Participation participation) {
        participations.add(participation);
    }
    
    // Feedback Methods
    public static void addFeedback(Feedback feedback) {
        feedbacks.add(feedback);
    }
    
    // Academic Methods
    public static void addAcademic(Academic academic) {
        academics.add(academic);
    }
}