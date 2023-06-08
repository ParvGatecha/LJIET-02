class Dat {
    int date,month,year;
    public int getDate() {
        return date;
    }
    
    @Override
    public String toString() {
        return "Dat [date=" + date + ", month=" + month + ", year=" + year + "]";
    }

    public void setDate(int date) {
        this.date = date;
    }
    public int getMonth() {
        return month;
    }





    public void setMonth(int month) {
        this.month = month;
        
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Dat(){
        this.date=2;
        this.month=6;
        this.year=2023;
    }
    public Dat(int date,int month){
        this.date=date;
        this.month=month;
        this.year=2023;
    }
    public Dat(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public void show(){
        System.out.println(date+"/"+month+"/"+year);
    }
}

public class cons{
    public static void main(String args[]){
        Dat d1 = new Dat();
        Dat d2 = new Dat(3,11);
        Dat d3 = new Dat(29,11,2002);
        d1.show();
        d2.show();
        d3.show();
    }
}
