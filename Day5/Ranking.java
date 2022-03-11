import java.io.*;
import java.util.*;

import java.lang.*;
import java.lang.String;

class Ranking
{
   private String name;
   private int score;
   
   Ranking(String name, int score)
  {
      this.name = name;
      this.score = score; 
  }

  public String getName()
  { return name; }
  
  public int getScore()
  { return score; }

}

class RankingMain
{
  public static void main(String args[])
  {
    ArrayList<String> l1 = new ArrayList<String>();
    ArrayList<Integer> l2 = new ArrayList<Integer>();
    Ranking r = new Ranking();
    Scanner sc = new Scanner(System.in);
    System.out.println("Provide the number of players:");
    int n = sc.nextInt();
    String name;
    int score;
    
    for(int i=1; i<=n; i++)
    {
       System.out.println("Enter the name of player "+i);
       r.name(sc.nextLine());
       l1.add(r.name);
       System.out.println("Enter the score of player "+i);
       r.score(sc.nextInt());
       l2.add(r.score);
    }
   
    System.out.println(Collections.sort(l2));
  }
}
