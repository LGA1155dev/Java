package understending.to.exercises.test;

import understending.to.exercises.domain.DaysOfWeek;
import understending.to.exercises.domain.Week;

public class WeekTest {
    public static void main(String... args) {
        Week week1 = new Week(DaysOfWeek.FRIDAY);
        Week week2 = new Week(DaysOfWeek.MONDAY);
        System.out.println(week1);
        System.out.println(week2);
    }
}
