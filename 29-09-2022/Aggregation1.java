
class dataR_AnotherClass{
    int data(int  re){
        return re*re;
    }
}
class dataRecivedMainClass{
    dataR_AnotherClass AR;
    double pi=3.1416;
    double mR(int rr){
        AR =new dataR_AnotherClass();
        double x=pi*AR.data(rr);
        return x;

    }
}

public class Aggregation1 {
    public static void main(String[]args){
        dataRecivedMainClass a=new dataRecivedMainClass();
        double ans=a.mR(5);
        System.out.println(ans);

    }
    
}
