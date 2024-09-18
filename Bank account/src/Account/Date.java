package Account;

public class Date {
    private int month;
    private int year;
    private int day;

    private final int[] dayspermonth=
        {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int month, int day, int year){
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException
                ("month ("+month+") must be 1-12");
        }

        if(day <= 0 || (day > dayspermonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException
            ("day ("+day+") out-of-range for the specified month of the year");
        }

        if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException
            ("day ("+day+") out-of-range for the specified month of the year");
        }

        this.day =day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return String.format("%d/%d/%d", day,month,year);
    }
}