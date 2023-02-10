package org.example.chapter2test.test26;

enum Season {

    SPRING,
    SUMMER,
    WINTER
}

class Weather {//public class Weather

    public int getAverageTemperature (Season season) {
        switch (season) {
            default:
            case WINTER, SPRING:
                return 30;
        }
    }
}
