public class primeNo {
    public static void main(String[] args) {
        int no=7;
        int temp=0;
        for(int i=2;i<=no-1;i++){
            if(no%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("No is not a prime number");
        }
        else{
            System.out.println("No is prime number");
        }
    }
}
