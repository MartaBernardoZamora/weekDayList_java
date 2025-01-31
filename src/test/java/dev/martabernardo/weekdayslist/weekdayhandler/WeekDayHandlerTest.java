package dev.martabernardo.weekdayslist.weekdayhandler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;

public class WeekDayHandlerTest {

    @Test
    @DisplayName("Test createList method of uml diagram")
    void testCreateList() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();

       assertThat(weekDayHandler, is(notNullValue()));
       assertThat(weekDayHandler, instanceOf(WeekDayHandler.class));
       assertThat(weekDayHandler.weekDayHandler.size(), is(7));
    }
    @Test
    @DisplayName("Test getDays method")
    void testGetDays() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();

        List<String> daysExpected = weekDayHandler.getDays();

        assertThat(daysExpected, contains("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        assertThat(daysExpected.size(), is(7));
    }
    @Test
    @DisplayName("Test getSizeList method")
    void testGetSizeList() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();

        int sizeList = weekDayHandler.getSizeList();

        assertThat(sizeList, is(7));
    }
    @Test
    @DisplayName("Test deleteDay method")
    void testDeleteDay() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();

        weekDayHandler.deleteDay("Monday");

        List<String> daysExpected = weekDayHandler.getDays();

        assertThat(daysExpected, not(contains("Monday")));
        assertThat(daysExpected.size(), is(6));
    }
}
