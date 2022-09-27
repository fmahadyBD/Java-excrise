import java.util.Scanner;

public class w3_cod_10 {
    public static void main(String[]agrs){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of number you want to print normally");
        a=sc.nextInt();
        for(int i=0;i<=a;i++)
        System.out.println(+i);
        sc.close();
    }
}
