package ua.com.kisit.lab3;

public class Clock {

    private int hour = 0;
    private int minute = 0;

    public void nextMinute(){

        minute++;

        if(minute>59){
            minute = 0;
            hour++;
        }

        if(hour>23){
            hour = 0;
        }
    }


    public Clock() {
    }

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }
}
