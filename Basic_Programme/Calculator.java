import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter first number");
        int a= s.nextInt();
        System.out.println("enter second number");
        int b =s.nextInt();
        int res;
        System.out.println("enter the operation");
        String opr = s.next();
        s.close();
        switch(opr){
            case "+" : res =a+b;
                        System.out.println(res);
                        break;
            case "-" : res =a-b;
                        System.out.println(res);
                        break;
            case "*" : res =a*b;
                        System.out.println(res);
                        break;
            case "/" : res =a/b;
                        System.out.println(res);
                        break;
            default:
                System.out.println("please enter valid operation");
            



        }
    }
}
