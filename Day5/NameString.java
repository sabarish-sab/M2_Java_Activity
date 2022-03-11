import java.util.*;
import java.lang.String;

class NameString
{
  public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   String stringF = sc.next();
   String stringS = sc.next();
   
   String str1 = stringF.substring(0,1).toUpperCase()+stringF.substring(1);
   String str2 = stringS.toUpperCase();
   System.out.println(str1+" "+str2);
 }
}
   
