package com.eventmanagement.model;

public class Workshop {
    private int workshopId;
    private int eventId;
    private String title;
    private String instructor;

    // Constructors
    public Workshop() {}

    public Workshop(int workshopId, int eventId, String title, String instructor) {
        this.workshopId = workshopId;
        this.eventId = eventId;
        this.title = title;
        this.instructor = instructor;
    }

    // Getters and Setters
    public int getWorkshopId() { return workshopId; }
    public void setWorkshopId(int workshopId) { this.workshopId = workshopId; }
    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }
}