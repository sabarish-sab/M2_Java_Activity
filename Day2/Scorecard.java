import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.*;

 public class Scorecard 
{
private String teamname;
private String innings;
private int  score;

public void setTeamname(String team)
{
this.teamname=team;
}

public String getTeamname(){
return this.teamname;
}
public void setInnings(String in)
{
this.innings=in;
}
public String getInnings(){
return this.innings;
}
public void setScore(int n)
{
this.score=n;
}
public int getScore()
{
return this.score;
}
 
public void display(){

if(innings.equals("First"))
{
System.out.println("Name: "+teamname);
System.out.println("Scored: "+score);
System.out.println("Need "+score+"+1 to win the match");
}
else if(innings.equals("Second"))
{
System.out.println("Name: "+teamname);
System.out.println("Scored: "+score);
System.out.println("Match ends");
}
else
{
System.out.println("Invalid Input");
}
}
}
