package enums;

import java.time.temporal.WeekFields;

public enum WeekDays {

    PONIEDZIALEK("Poniedziłek"), WTOREK("Wtorek"), SRODA("Środa"), CZWARTEK("Czwartek"), PIATEK("Piątek"), SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
