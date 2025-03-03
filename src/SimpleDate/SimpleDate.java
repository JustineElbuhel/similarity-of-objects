package SimpleDate;

import java.util.Objects;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean equals(Object object){
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }

        if(object == this){
            return true;
        }

        SimpleDate compared = (SimpleDate) object;

        return (this.day == compared.day &&
                this.month == compared.month &&
                this.year == compared.year);
    }

    public int hashCode(){
        return Objects.hash(day,month, year);
    }

    @Override
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }

    public static void main(String[] args){
        SimpleDate date = new SimpleDate(1, 2, 2000);
        SimpleDate date2 = new SimpleDate(1, 2, 2000);
        System.out.println(date.equals("heh"));
        System.out.println(date.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(date.equals(new SimpleDate(1, 2, 2000)));

        System.out.println("");
        System.out.println(date.hashCode());
        System.out.println(date2.hashCode());
    }

}
