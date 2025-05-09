package com.niet.model;

import java.util.Date;

public class Event {
    private String eventId;
    private String eventName;
    private Date eventDate;
    private String location;
    
    // Default constructor
    public Event() {}
    
    // Parameterized constructor
    public Event(String eventId, String eventName, Date eventDate, String location) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
    }
    
    // Getters and setters (Right-click > Source > Generate Getters and Setters)
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }
    public Date getEventDate() { return eventDate; }
    public void setEventDate(Date eventDate) { this.eventDate = eventDate; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}