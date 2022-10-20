public class practise {

  public static void main(String[] args) {
    String n1 = "12";
    String n2 = "15";
    int n=n1.charAt(n1.length()-1);
    int m=n2.charAt(n2.length()-1);
    System.out.println(n);
    System.out.println(m);
    int p=n*m;
    System.out.println(p);
    if(p%2==0){
        System.out.println("1");
    }else{
        System.out.println("0");
    }



  }
}
