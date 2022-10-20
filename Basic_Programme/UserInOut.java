import java.util.Scanner;

public class UserInOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.next();
        System.out.println("Enter  your gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your age");
        int age =sc.nextInt();
        System.out.println("Name is " +name +" gender is = " +gender+ " Age is = " +age);
        sc.close();
    }
}
