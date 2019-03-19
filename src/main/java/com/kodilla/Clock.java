package com.kodilla;
import java.util.*;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void addOneMinute() {
        minute = minute + 1;
    }

    @Override
    public String toString() {
        return  hour + " : " + minute + " : " + second;
    }
}

class Kodilla {
    public static void main(String[] args) {

        Clock clock1 = new Clock(10, 30, 00);
        Clock clock2 = new Clock(10, 59, 00);
        Clock clock3 = new Clock(23, 59, 00);

        List<Clock> list = new LinkedList<>();

        list.add(clock1);
        list.add(clock2);
        list.add(clock3);

        for(int i = 0; i < list.size(); i++) {
            list.get(i).addOneMinute();
            System.out.println(list.get(i));

        }
    }
}
