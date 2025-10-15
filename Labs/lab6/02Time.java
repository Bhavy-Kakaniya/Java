class time {
    int hour;
    int min;

    public time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public void addition(int hour, int min) {
        this.min += min;
        if (this.min > 59) {
            this.hour++;
            this.min -= 60;
        }
        this.hour += hour;
    }
}

public class _02time {
    public static void main(String[] args) {
        time t1 = new time(5, 30);
        t1.addition(2, 45);
        System.out.println("ans" + t1.hour + ":" + t1.min);
    }
} 
