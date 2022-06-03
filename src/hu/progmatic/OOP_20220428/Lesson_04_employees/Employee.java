package hu.progmatic.OOP_20220428.Lesson_04_employees;

import java.util.Objects;

public class Employee {

    private final String id;
    private String name;
    private int age;
    private boolean isFemale;
    private int salaty;

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String name, int age, boolean isFemale, int salaty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.salaty = salaty;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public int getSalaty() {
        return salaty;
    }

    public void setSalaty(int salaty) {
        this.salaty = salaty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String  toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isFemale=" + isFemale +
                ", salaty=" + salaty +
                '}';
    }
}
