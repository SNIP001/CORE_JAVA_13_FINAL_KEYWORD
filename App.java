package $13_final_keyword;


public class App {
    public static void main(String[] args) {
        final int a = 100;
//  The final keyword in java is used to restrict the user.        
//        a= 200;
// The java final keyword can be used in many context. Final can be:
//  1. variable [If you make any variable as final, you cannot change the value of final variable(It will be constant).]
//  2. method   [If you make any method as final, you cannot override it.]
//  3. class    [If you make any class as final, you cannot extend it.]
        System.out.println(a);
        
        
        
        Child c = new Child(10,20);
        System.out.println(c.a);  //    shadowing concept
     
        
    }
}
