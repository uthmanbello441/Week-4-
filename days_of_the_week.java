// Enum to represent days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Superclass
class Week {
    protected Day[] days;

    public Week() {
        days = Day.values(); // Get all days from enum
    }

    public void printDays() {
        System.out.println("Days of the week:");
        for (Day day : days) {
            System.out.println(day);
        }
    }
}

// Subclass
class DisplayWeek extends Week {

    public void printFormattedDays() {
        System.out.println("Formatted Days of the Week:");
        for (Day day : days) {
            String formatted = day.toString().substring(0, 1) + day.toString().substring(1).toLowerCase();
            System.out.println(formatted);
        }
    }
}

// Main class
public class DaysOfWeekProgram {
    public static void main(String[] args) {
        DisplayWeek display = new DisplayWeek();

        // Calling method from superclass
        display.printDays();

        // Calling extended method from subclass
        System.out.println();
        display.printFormattedDays();
    }
}
