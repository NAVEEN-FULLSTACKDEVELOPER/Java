import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Enter a positive number (or 0 or negative to stop): ");      
            int num = s.nextInt();    

            if (num <= 0) {                                    
                break;
            }

            sum += num;                 
        }

        System.out.println("Total Sum = " + sum);           
        s.close();
    }

  }

