public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(){
        day=1;
        month=1;
        year=1;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public MyDate(int d, int m, int y){
        day=d;
        month=m;
        year=y;
    }


}
