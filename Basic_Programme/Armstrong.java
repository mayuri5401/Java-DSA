public class Armstrong {
    public static void main(String[] args) {
        int no =153;
        int t1=no;
        int len=0;

        while(t1!=0){
            len=len+1;
            t1=t1/10;
        }
        
        int t2=no;
        int arm=0;
        while(t2!=0){
            int mul=1;
            int rem=t2%10;
            for(int i =1;i<=len;i++){
                mul=mul*rem;
            }
            arm =arm +mul;
            t2=t2/10;
        }
        if(arm==no){
            System.err.println(no +" Armstrong number");
        }else{
            System.out.println(no +" not armstrong");
        }
    }
}