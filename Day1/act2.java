package act;

import java.util.Scanner;

public class act2 {
	public static boolean same_last_name(String s1, String s2)
	{
		int n1=0,n2=0,i;
		String s3, s4;
		for(i=0;i<s1.length();i++)
		{
			if(Character.isWhitespace(s1.charAt(i)))
			{
				n1=i;
			}
		}
		for(i=0;i<s2.length();i++)
		{
			if(Character.isWhitespace(s2.charAt(i)))
			{
				n2=i;
			}
		}
		s3=s1.substring(n1);
		s4=s2.substring(n2);
		if(s3.equalsIgnoreCase(s4))
		{
			return true;
		}
		else
		{
		    return false;
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String p1,p2;
		p1=in.nextLine();
		p2=in.nextLine();
		in.close();
		if(same_last_name(p1,p2)== true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
