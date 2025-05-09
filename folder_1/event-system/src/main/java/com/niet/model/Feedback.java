package com.niet.model;

public class Feedback {
    private String feedbackId;
    private String eventId;
    private int rating;
    private String comments;
    
    public Feedback() {}
    
    public Feedback(String feedbackId, String eventId, int rating, String comments) {
        this.feedbackId = feedbackId;
        this.eventId = eventId;
        this.rating = rating;
        this.comments = comments;
    }
    
    // Generate Getters/Setters
    // (Repeat same process as above)
}