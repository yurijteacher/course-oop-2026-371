package ua.com.kisit.lab3;

public class ClockExt2 extends  ClockExt{

    private int ms = 0;

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public ClockExt2() {
    }

    public ClockExt2(int ms) {
        this.ms = ms;
    }

    public ClockExt2(int second, int ms) {
        super(second);
        this.ms = ms;
    }

    public ClockExt2(int hour, int minute, int second, int ms) {
        super(hour, minute, second);
        this.ms = ms;
    }

    public void nextMs(){
        ms+=100;

        if(ms==1000){
            ms = 0;
            super.nextSecond();
        }
    }

    @Override
    public String toString() {
        return
                "ClockExt2{" +
                        "hour=" + super.getHour() +
                        ", minute=" + super.getMinute() +
                        ", second=" + super.getSecond() +
                        ", ms=" + ms +
                '}';
    }
}
