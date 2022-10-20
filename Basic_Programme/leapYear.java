public class leapYear {
    public static void main(String[] args) {
        int year = 2022;
        if( (year%4==0&&year%400==0) &&(year %4==0&& year%100!=0)){
            System.out.println(year +"it is a leap year");
        }else{
                System.out.println("it is not a leap year");
        }
    }
}
