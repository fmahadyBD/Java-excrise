
//Hierarchical Inheritance Example

public class a3{
    public void aa(){
        System.out.println("This is a\n");
    }
}
// extwnds class in a class
class b extends a3{
    public void bb(){
        System.out.println("This is b\n");
    }
}
class c extends a3{
    public void cc(){
        System.out.println("This is c");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Mian method!\n");
        // in here we make an object for calling method;
        //we extends class a3 in  class b
        // new need make object for calling method
        c s=new c();
        s.aa();
        //we call method by using object
        /*iN HERE WE CREATE AN OBJECT  of class c . we extends class a3 in b and also class a3  in class c;
        we can assecss class a3 and c by object s; if we want to assess class b we need to create new object*/
      
      //s.bb(); this is wrong.
      /* b ss=new b();
            ss.bb();
            ss.aa();
            */
        s.cc();
    }
}