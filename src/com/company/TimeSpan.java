package com.company;

public class TimeSpan {
    public int hours;
    public int minutes;

    public TimeSpan() {
    }

    public TimeSpan(int hours, int minutes) {
        if (minutes > 60) {
            throw new IllegalArgumentException("Error minutes > 60");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        if (minutes + timeSpan.minutes < 60) {
            hours += timeSpan.hours;
            minutes += timeSpan.minutes;
        } else {
            hours = hours + timeSpan.hours + 1;
            minutes = minutes + timeSpan.minutes - 60;
        }
    }

    public void sub(TimeSpan timeSpan) {
        int n1 = hours * 60 + minutes;
        int n2 = timeSpan.hours * 60 + timeSpan.minutes;
        int n3 = n2 - n1;
        if(n3 >= 0) {
            hours = n3 / 60;
            minutes = n3 % 60;
        }else{
            System.out.println("Error: отрицательное время");
            hours = 0;
            minutes = 0;
        }
    }

    public void mult(double times) {
        if (minutes * times < 60) {
            hours *= times;
            minutes *= times;
        } else if (minutes * times == 60) {
            hours *= times;
            hours = hours + 1;
            minutes = 0;
        } else if (minutes * times > 60) {
            minutes *= times;
            int n = minutes / 60;
            minutes = minutes % 60;
            hours *= times;
            hours = hours + n;
        }
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                hours +
                ":" + minutes +
                '}';
    }
}
