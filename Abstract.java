import java.io.*;
import java.util.*;
import java.lang.String;

class Match
{
  int currentscore;
  float currentover;
  int target;
  
  Scanner sc = new Scanner(System.in);
  /*abstract float calculateRunRate();
  abstract int calculateBalls(int);
  abstract void display();*/
}
/*
class ODIMatch extends Match 
{
  float calculateRunRate(){
   
  }

  int calculateBalls(int currentover){
    int balls = (50-currentover)*6;
    return balls;
  }

  void display(){
    int runs = ;
    System.out.println("Need "+ +" runs in "+calculateBalls());
  }
}

class TestMatch extends Match
{
  float calculateRunRate(){

}

  int calculateBalls(int currentover){
    int balls = (90-currentover)*6;
    return balls;
}

  void display(){
    
    System.out.println("Need "+ +" runs in "+calculateBalls());
}
}

class T20Match extends Match
{
  float calculateRunRate(){

}

  int calculateBalls(int currentover){
    int balls = (20-currentover)*6;
    return balls;
}

  void display(){
    
   System.out.println("Need "+ +" runs in "+calculateBalls());
}
}
*/
class MatchMain
{
  public static void main(String args[])
 {
   Match m = new Match();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the match format\n"+"1. ODI\n"+"2. T20\n"+"3. Test");
   int i = sc.nextInt();
   System.out.println("Enter the current score");
   m.setScore(sc.nextInt());
   System.out.println("Enter the current over");
   m.setOver(sc.nextInt());
   System.out.println("Enter the target score");
   m.setTarget(sc.nextInt());
   /*switch(i){
     case 1: m = new ODIMatch();
             m.display();
             break;
     case 2: m = new T20Match();
             m.display();
             break;
     case 3: m = new TestMatch();
             m.display();
             break;        
   }*/
 }
}
