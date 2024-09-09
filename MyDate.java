import java.util.Calendar;
import java.util.GregorianCalendar;
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        Calendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(System.currentTimeMillis() + elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month + 1;
    }

    public int getDay() {
        return day;
    }

    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        long elapsedTime = 1000L * 24 * 60 * 60 * 1000;
        MyDate futureDate = new MyDate(elapsedTime);
        System.out.println("Current Date: " + currentDate.getYear() + "/" + currentDate.getMonth() + "/" + currentDate.getDay());
        System.out.println("Future Date: " + futureDate.getYear() + "/" + futureDate.getMonth() + "/" + futureDate.getDay());
    }
}