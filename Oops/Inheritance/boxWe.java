public class boxWe extends box{
    int val;

    boxWe(int val){
        this.val=val;
        //cant access private vairable
        //if in parent, private double l
        //then, this.l is NOT POSSIBLE
    }

    boxWe(double l, double h,double w,int val ){
        super(l,h,w); //calls immidiate parent class constructor
        //in super we can access private because it call parent class conctructor for that not child
        
        this.val=val;
    }

    public void Disply(){
        System.out.println("val"+val+"height"+this.h);
    }
}