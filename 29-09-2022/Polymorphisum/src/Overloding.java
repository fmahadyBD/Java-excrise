public class Overloding{
    public static void main(String[]agrs){
        ad ay =new ad();
     
        System.out.println( ay.a(4,5));
    }
    /* If a class has multiple methods having same name but different in parameters, it is known as Method Overloading. */
    
}
class ad{
    public int a(int x, int y){
        return x*y;
    }
    public int a(int x,int y,int z){
        return x*y*z;
    }
}
