class Person {
    private int age = 10;
    public Person(){
        System.out.println("initialized age:"+age);
    }
    public int GetAge(int age){
        this.age = age;
        return this.age;
    }
}
public class Main {
    public static void main(String[] args) {
        Person Harry = new Person();
        System.out.println("Harry's age is "+Harry.GetAge(12));
    }
} 