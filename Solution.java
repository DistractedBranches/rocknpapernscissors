import java.util.Scanner;

public class Solution {

public static void main(String[] args){
    String p1;
    String p2;
    System.out.println("Player one select rock, paper, or scissors");
    Scanner in = new Scanner(System.in);
    p1 = in.nextLine();
    System.out.println("Player two select rock, paper, or scissors");
    p2 = in.nextLine();
    if(p1.equals("rock") && p2.equals("paper") || p1.equals("paper")
            && p2.equals("scissors") || p1.equals("scissors") && p2.equals("rock")){
        System.out.println("Player 2 wins");
    } else if(p2.equals("rock") && p1.equals("paper") || p2.equals("paper")
            && p1.equals("scissors") || p2.equals("scissors") && p1.equals("rock")){
        System.out.println("Player 1 wins");
    }else if(p1.equals(p2)){
        System.out.println("Draw");
    }

}



}
