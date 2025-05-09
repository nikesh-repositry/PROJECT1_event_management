package com.niet.model;

public class Academic {
    private String academicId;
    private String eventId;
    private String department;
    private String academicCredit;
    
    public Academic() {}
    
    public Academic(String academicId, String eventId, String department, String academicCredit) {
        this.academicId = academicId;
        this.eventId = eventId;
        this.department = department;
        this.academicCredit = academicCredit;
    }
    
    // Generate Getters/Setters
}