package com.eventmanagement.model;

import java.util.Date;

public class Event {
    private int eventId;
    private String name;
    private String description;
    private Date date;
    private String location;

    // Constructors
    public Event() {}

    public Event(int eventId, String name, String description, Date date, String location) {
        this.eventId = eventId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.location = location;
    }

    // Getters and Setters
    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}