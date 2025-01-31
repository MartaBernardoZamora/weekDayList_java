package dev.martabernardo.weekdayslist.weekdayhandler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.instanceOf;

public class WeekDayHandlerTest {

    @Test
    @DisplayName("Test createList method")
    void testCreateList() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();

       assertThat(weekDayHandler, is(notNullValue()));
       assertThat(weekDayHandler, instanceOf(WeekDayHandler.class));

    }
}
