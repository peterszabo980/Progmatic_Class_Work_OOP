package hu.progmatic.OOP_20220425.club_01_practice;

public class Person {
    public static final int POPULATION = 20000000;
    private static int currentYear;

    private final String id;
    private String name;
    private int age;

    public Person(String id) {
        this.id = id;
    }
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public static void setCurrentYear(int currentYear) {
        Person.currentYear = currentYear;
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

    @Override
    public String toString() {
        return "Person{" +
                "POPULATION='" + POPULATION + '\'' +
                "currentYear='" + currentYear + '\'' +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
