package dev.martabernardo.weekdayslist;

import dev.martabernardo.weekdayslist.weekdayhandler.WeekDayHandler;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();
        weekDayHandler.getDays();
        weekDayHandler.getSizeList();
        weekDayHandler.deleteDay("Monday");
        weekDayHandler.getSpecificDay("Tuesday");
        weekDayHandler.dayExists("Tuesday");
        weekDayHandler.emptyList();
    }
}
