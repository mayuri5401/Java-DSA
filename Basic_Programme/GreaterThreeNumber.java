public class GreaterThreeNumber {
    public static void main(String[] args) {
        int a=23,c=12,b=20;
        if(a>b){
            if(a>c){
                System.out.println("A is greater!");
            }
            else 
            {
                System.out.println("c is greater!");
            }
        }
        else if(b>c){
            System.out.println("b is greater!");
        }
        else {
            System.out.println("c is greater!");
        }
    }
    
}