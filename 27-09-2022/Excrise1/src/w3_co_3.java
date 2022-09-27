import java.util.Scanner;

public class w3_co_3 {

    public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a=sc.nextInt();
    System.out.println("Enter the second number:");
    int b=sc.nextInt();
    System.out.println("Enter the third number:");
    int c=sc.nextInt();
    if(a>b&& a>c){
        System.out.println("The large number is: "+a);
    }else if(b>c&&b>a){
        System.out.println("The large number is: "+b);
    }else if(c>a &&c>b){
        System.out.println("The large number is:"+c);
    }else{
        System.out.println("There is equal number");
    }
sc.close();

    }
    
}
