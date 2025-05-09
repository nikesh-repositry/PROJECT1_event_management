package com.event.model;

import java.util.Date;

public class Event {
    private String eventId;
    private String eventName;
    private Date eventDate;
    private String location;

    // Constructor
    public Event(String eventId, String eventName, Date eventDate, String location) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
    }

    // Getters and Setters (Add using Source > Generate Getters/Setters)
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }
    // Repeat for other fields
}