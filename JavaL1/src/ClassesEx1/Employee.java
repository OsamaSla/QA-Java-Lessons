package ClassesEx1;

// Employee.java
public class Employee {
    private int age;
    private String name;
    private String email;

    // Constructor
    public Employee(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "age=" + age +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}