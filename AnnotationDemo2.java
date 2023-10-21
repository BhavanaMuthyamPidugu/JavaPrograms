/** Java Program to demonstrate ANNOTATIONS.
 * AnnotationDemo2.java  */
 
 class A{
     void m(){
         System.out.println("Inside method m");
     }
     @Deprecated
     void n(){
         System.out.println("Inside method n");
     }
 }
 class AnnotationDemo2{
     public static void main(String[] args)
     {
         A a=new A();
         a.n();
         //call for Deprecated method
     }
 }
