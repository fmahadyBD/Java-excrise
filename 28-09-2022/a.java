//Single Inheretance
public class a{
    public void aa(){
        System.out.println("This is a");
    }
}
// extwnds class in a class
class b extends a{
    public void bb(){
        System.out.println("This is b");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Mian method!");
        // in here we make an object for calling method;
        //we extends class a in  class b
        // new need make object for calling method
        b s=new b();
        s.aa();
        //we call method by using object
        s.bb();
    }
}