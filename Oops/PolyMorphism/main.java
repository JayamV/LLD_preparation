public class main{
    public static void main(String[] args){
        System.out.println("hi");

        circle c1=new circle();
        c1.area();
        triangle t1=new triangle();
        t1.area();
        shapes s=new shapes();
        s.area();


        //upcasting it IS-A aLlowed
        shapes s2=new circle();
        s2.area();

        // circle c4=new shapes();
        // c4.area();

        // throws the error of incompatible types
        c1.ar(); //only parent decide what to do, not child
        
    }
}