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
}
