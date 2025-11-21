import java.util.Scanner;

public class Tickets {
  public static void main(String[] args) {
  // write your code here
  Scanner scan = new Scanner(System.in);
  System.out.println("Please choose one seat: B for box, P for pavilion, and L for lawn. Press Q to quit.");
  int totalB = 0;
  int totalP = 0;
  int totalL = 0;
  double costB = 0;
  double costP = 0;
  double costL = 0;
  double conv = 0;
  String option = scan.nextLine();
  while(!option.toLowerCase().equals("q")){
    System.out.println("Please pick another option.");
    option = scan.nextLine();
    if(option.toLowerCase().equals("b")){
      totalB++;
      costB += 75;
      conv += 1.5;
    }
    else if(option.toLowerCase().equals("p")){
      totalP++;
      costP += 30;
      conv += 1.5;
    }
    else if(option.toLowerCase().equals("l")){
      totalL++;
      costL += 21;
      conv += 1.5;
    }

  }
  System.out.println(totalB + "   Box tickets:       $" + costB);
  System.out.println(totalP + "   Pavilion tickets:  $" + costP);
  System.out.println(totalL + "   Lawn tickets:      $" + costL);
  System.out.println("    Convenience fee:    $" + conv);
  System.out.println("    total:              $" + (conv + costL + costP + costB));
  }
}
// write any helper methods here
