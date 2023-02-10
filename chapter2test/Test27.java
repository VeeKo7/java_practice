package org.example.chapter2test;

//public class TourBus
public class Test27 {
    public static void main(String[] args) {

        var nycTour = new String [] {"DownTown", "Uptown", "Brooklyn"};
        var times = new String [] {"Day", "Night"};

        for (int i = 1, j = 0; i < nycTour.length && j < times.length; i++, j++) {
            System.out.println(nycTour[i] + "-" + times[j]);
        }
    }

}
