class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Happy", 19);
            System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());

            Person person2 = new Person("John", -10);
            System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
        } catch (InvalidAgeException ex) {
            System.out.println("Invalid Age Exception: " + ex.getMessage());
        }
    }
}

