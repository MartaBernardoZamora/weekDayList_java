package dev.martabernardo.weekdayslist.weekdayhandler;

import java.util.ArrayList;
import java.util.List;

public class WeekDayHandler {
    List<String> weekDayHandler = new ArrayList<>();

    public void createList() {
        weekDayHandler.addAll(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    public List<String> getDays() {
        return weekDayHandler;
    }

    public int getSizeList() {
        return weekDayHandler.size();
    }

    public void deleteDay(String day) {
        weekDayHandler.remove(day);
    }

    public String getSpecificDay(String day) {
        return weekDayHandler.get(weekDayHandler.indexOf(day));
    }

    public boolean dayExists(String day) {
        return weekDayHandler.contains(day);
    }

    public void emptyList() {
        weekDayHandler.clear();
    }
}
