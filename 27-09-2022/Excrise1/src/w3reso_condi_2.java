import java.util.Scanner;

public class w3reso_condi_2{
    /**
     * @param agrs
     * @throws Exception
     */
    public static void main(String[]agrs) throws Exception {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number one:");
        a=sc.nextDouble();
        System.out.println("Enter the number second:");
        b=sc.nextDouble();
        System.out.println("Enter the number third:");
        c=sc.nextDouble();

        double r= b*b-4.0*a*c;
        if(r>0.00){
            double r1=(-b+(Math.pow(r,0.5)))/2*a;
            double r2=(-b-(Math.pow(r,0.5)))/2*a;
            System.out.println("The root is"+r1+"and "+r2);
            
        }else if(r==0){
            double r3=-b/2*a;
            System.out.println("The root is "+r3);

        }else{
            System.out.println("The is an imaginearey number");
        }
        sc.close();
    }
   

    
}
