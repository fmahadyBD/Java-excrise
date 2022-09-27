import java.util.Scanner;

public class w3_co_4 {
    public static void main(String[]agrs){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number you want to cheeck");
     float a=sc.nextFloat();
     if(a==0){
        System.out.println("this is zeroo");
     }else if(a>0){
        System.out.println("This is a positive number");
     }else if(a<0){
        System.out.println("This is Nagetive number:");
     }
     sc.close();
    }
}
