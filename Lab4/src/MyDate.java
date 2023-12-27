public class MyDate {
    public int day;
    public int month;
    public int year;
    
    public void showDate(){
        System.out.println(String.format("%d/%d/%d", day, month, year));
    }
}