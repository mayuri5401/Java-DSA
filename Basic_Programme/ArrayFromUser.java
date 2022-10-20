import java.util.Scanner;

public class ArrayFromUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll [] =new int[5];
        for(int i=0; i<roll.length; i++){
            System.out.println("enter "+ i+1 +" th roll no");
            roll[i] = sc.nextInt();
        }
        System.out.println("Roll numbers are =  ");
        for(int val : roll){
            System.out.println(val);
        }
        sc.close();
    

    }
}