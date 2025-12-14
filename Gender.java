import java.util.Scanner;

class A{
  Scanner s1=new Scanner(System.in);
  Scanner s2=new Scanner(System.in);
  int age=s1.nextInt();
  String gender=s2.nextLine();


  public void displayinfo(){
    if(age > 55 && gender.equalsIgnoreCase("female")){
      System.out.println("Eligible  retirement for women ");
    }
    else if(age> 60 && gender.equalsIgnoreCase("Male")){
      System.out.println("Eligible retirement for Male");
    }
    else{
      System.out.println(" Not eligible for retirement");       
    }
  }
 }

public class Gender {
  public static void main(String[] args) {
    A a1=new A();       
    a1.displayinfo();
  }
}

