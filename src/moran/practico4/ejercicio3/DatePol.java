package moran.practico4.ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class DatePol extends Politic {

    private int minDays;

    public DatePol(int minDays) {
        this.minDays = minDays;
    }

    public int getMinDays() {
        return minDays;
    }

    public void setMinDays(int minDays) {
        this.minDays = minDays;
    }

    @Override
    public boolean acepted(Order order) {
        int dayBetween = Period.between(LocalDate.now(), order.getMaxDate()).getDays();
        return dayBetween > minDays;
    }
}
