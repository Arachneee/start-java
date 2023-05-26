package chapter1_5;

public class Timetest{
    public static void main(String args[]){
        Time t = new Time(30);
        System.out.println(t);
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}
class Time {
    private int hour;

    Time(int hour){
        setHour(hour);
    }

    public int getHour() { return hour;}
    public void setHour(int hour){
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public String toString(){
        return hour + ":00";
    }
}