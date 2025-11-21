import java.util.Scanner;
public class Grades {
  public static void main(String[] args) {
  //  write your code here

  
    Scanner scan = new Scanner(System.in);
    System.out.println("Please put the amount of grades that you will be entering.");
    int end = scan.nextInt();
    double Total = 0;
    for(int i = 0; i < end; i++){
      System.out.println("Please enter one grade at a time.");
      Total += scan.nextDouble();

    }
    double average = Total / end;
    System.out.println("Your average is: " + average);

    scan.close();
  }
}
  


// write any helper methods here
