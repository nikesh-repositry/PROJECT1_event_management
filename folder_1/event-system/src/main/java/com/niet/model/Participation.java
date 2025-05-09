package com.niet.model;

public class Participation {
    private String participationId;
    private String eventId;
    private String participantName;
    private String email;
    
    public Participation() {}
    
    public Participation(String participationId, String eventId, String participantName, String email) {
        this.participationId = participationId;
        this.eventId = eventId;
        this.participantName = participantName;
        this.email = email;
    }
    
    // Generate Getters/Setters (Right-click > Source > Generate Getters and Setters)
    public String getParticipationId() { return participationId; }
    public void setParticipationId(String participationId) { this.participationId = participationId; }
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }
    public String getParticipantName() { return participantName; }
    public void setParticipantName(String participantName) { this.participantName = participantName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}