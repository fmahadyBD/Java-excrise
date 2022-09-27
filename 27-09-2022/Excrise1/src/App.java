import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number you want to cheeck");
       a=sc.nextInt();
       if(a>0){
        System.out.println("This is positive number");
       }else if(a<0){
        System.out.println("This is negative number");
       }else{
        System.out.println("You pressed 0");
       }

       sc.close(); 
    }
}
