package moran.practico2.ejercicio5.parte1;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Schedule {
    private List<Meeting> meetings;

    public Schedule() {
        this.meetings = new LinkedList<Meeting>();
    }

    public boolean addMeeeting(Meeting meeting) {
        if (meetings.size() == 0) {
            meetings.add(meeting);
            return true;
        }
        Iterator<Meeting> it = meetings.iterator();
        while (it.hasNext()) {
            if (it.next().checkOverlap(meeting))
                return false;
        }
        meetings.add(meeting);
        return true;
    }

    public Meeting getMeeting(LocalDate day, LocalTime start) {
        Iterator<Meeting> it = meetings.iterator();
        while (it.hasNext()) {
            Meeting aux = it.next();
            if (aux.getDay().equals(day) && aux.getStart().equals(start))
                return aux;
        }
        return null;
    }

    public boolean checkMeeting(LocalDate day, LocalTime start) {
        return this.getMeeting(day, start) != null;
    }

}
