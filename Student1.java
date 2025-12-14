class Student{
  String name;
  int rollno;
  int age;

 public void show( int age, int rollno, String name){
    this.rollno = rollno;
    this.name = name;
    this.age=age;

    System.out.println("Name :" + name);
    System.out.println("Rollno :"+ rollno);
    System.out.println("age :"+ age);
  }

}
public class Student1 {
  public static void main(String[] args) {
    Student s1=new Student();
    s1.show(20, 205, "Naveen");
  }
}
