/** Java Program to demonstrate ANNOTATIONS.
 * AnnotationDemo.java  */
 
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    @Override   //override annotation
    void eat(){ //DOG class overriding Parent class ANIMAL method
        super.eat();    //invoking parent method of "DOG" class
        System.out.println("Dog can also eat");
    }
}
class AnnotationDemo{
    public static void main(String[] args) {
        Animal A=new Dog();
        A.eat();
    }
}
