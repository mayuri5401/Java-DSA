public class Factorial {
    public static void main(String[] args) {
        int no=5;
        int fact=1;
        //using increament operator
        // for(int i=1;i<=no;i++){
        //    fact=fact*i;
        // }

        //using dreament operator
        for(int i =no;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
