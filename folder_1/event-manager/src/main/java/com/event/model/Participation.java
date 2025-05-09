package com.event.model;
import java.util.Objects;
/**
 * Represents a participant's registration for an event
 */
public class Participation {
    private String participantName;
    private String eventId;
    private String email;

    /**
     * Constructs a new Participation record
     * @param participantName Name of the participant
     * @param eventId ID of the event being participated in
     * @param email Email address of the participant
     */
    public Participation(String participantName, String eventId, String email) {
        this.participantName = participantName;
        this.eventId = eventId;
        this.email = email;
    }

    /**
     * @return The participant's name
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * Sets the participant's name
     * @param participantName New name value
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /**
     * @return The event ID this participation is for
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the event ID
     * @param eventId New event ID value
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * @return The participant's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the participant's email address
     * @param email New email value
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string representation of the participation
     * @return Formatted string with participation details
     */
    @Override
    public String toString() {
        return "Participation{" +
                "participantName='" + participantName + '\'' +
                ", eventId='" + eventId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Compares this participation to another object for equality
     * @param o Object to compare
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participation that = (Participation) o;
        return participantName.equals(that.participantName) &&
                eventId.equals(that.eventId) &&
                email.equals(that.email);
    }

    /**
     * Generates a hash code for this participation
     * @return The hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(participantName, eventId, email);
    }
}