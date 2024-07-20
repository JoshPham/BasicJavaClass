public class Student {
  private String name; // private means that only the Student class can access this variable
  private int age;     // you don't want this to be public because you don't want other classes
  private int grade;   // to be able to change the values of these variables

  public Student(String name, int age, int grade) { // this is a basic constructor
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public String getName() { // this is called a accessor method (because the attr is private)
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getGrade() {
    return grade;
  }

  public void setName(String name) { // this is called a mutator method
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void sayHi() {
    System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
  }

  public String toString() {
    return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
  }
}
