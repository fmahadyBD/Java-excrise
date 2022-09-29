/*If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java. */

public class Override extends eat {
    public static void main(String[]agrs){
      
    Override object=new Override();
    object.eat();

    } 
    void eat(){
        System.out.println("Jack");
        // there in in main method so it called
    }
    
}

class eat{
    void food(){
        System.out.println("Mango");
    }
}