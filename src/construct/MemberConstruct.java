package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){
        this(name,age,50); // Change
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("Call Construct name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
