package moran.practico2.ejercicio5.parte1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Meeting {
    private Map<Integer, Person> assistants;
    private Map<Integer, Person> participants;
    LocalDate day;
    private LocalTime start, end;
    private String subject;


    public Meeting(String subject, LocalDate day, LocalTime start, LocalTime end) {
        this.assistants = new HashMap<Integer, Person>();
        this.participants = new HashMap<Integer, Person>();
        this.day = day;
        this.subject = subject;
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public String getSubject() {
        return subject;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDay() {
        return day;
    }

    public boolean addParticipant(Person participant) {
        if (this.checkParticipant(participant))
            return false;
        participants.put(participant.getDni(), participant);
        return true;
    }

    public boolean addAssitant(Person assistant) {
        if (this.checkAssistant(assistant))
            return false;
        assistants.put(assistant.getDni(), assistant);
        return true;
    }

    public boolean checkParticipant(Person person) {
        return participants.containsKey(person.getDni());
    }

    public boolean checkAssistant(Person person) {
        return assistants.containsKey(person.getDni());
    }

    public boolean checkOverlap(Meeting m1) {
        return !start.isAfter(m1.getEnd()) && !m1.getStart().isAfter(end);
    }

}

