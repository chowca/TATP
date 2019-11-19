package student_pkg;

public class main {
    public static void main(String[] args) {
        Student stduent_1 = new Student("Tom",1,'M',"A1234567");
        String output = "Student Info - ";
        output = output.concat("Name: " + stduent_1.getName() + ", ");
        output = output.concat("Age: " + stduent_1.getAge() + ", ");
        output = output.concat("Gender: " + stduent_1.getGender() + ", ");
        output = output.concat("ID NO: " + stduent_1.getId());
        System.out.println(output);
    }
}
