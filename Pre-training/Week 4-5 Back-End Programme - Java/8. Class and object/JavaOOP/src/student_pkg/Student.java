package student_pkg;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String id_no;

    Student(String name, int age, char gender, String id_no){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id_no = id_no;
    };

    public String getName(){
        return name;
    };
    public void setName(String name){
        this.name = name;
    };

    public int getAge(){
        return age;
    };
    public void setAge(int age){
        this.age = age;
    };

    public char getGender(){
        return gender;
    };
    public void setGender(char gender){
        this.gender = gender;
    };

    public String getId(){
        return id_no;
    };
    public void setId(String id_no){
        this.id_no = id_no;
    };
};