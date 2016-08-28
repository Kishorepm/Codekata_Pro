package pro_LEVEL;

import java.util.*;

public class costOfstring {
	public static void main(String[] args)
	{
		int menu=1;
		StringBuffer str=new StringBuffer();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		str.append(s.nextLine());
		int pos,option,cost = 0;
		char rep;
		
		while(menu==1)
		{
			System.out.println("1.REPLACE");
			System.out.println("2.INSERT");
			System.out.println("3.DELETE");
		System.out.println("Enter your option");
		option=s.nextInt();
		switch(option)
		{
		case 1:
			//Replace
			System.out.println("Enter the char to replace");
			rep=s.next().charAt(0);
			System.out.println("Enter the position");
			pos=s.nextInt();
			str.setCharAt(pos, rep);
			System.out.println(str);
			cost=cost+5;
			System.out.println("Do u wanna proceed(y-1/n-0");
			menu=s.nextInt();
			break;
		case 2:
			//Insert
			System.out.println("Enter the char to insert");
			rep=s.next().charAt(0);
			System.out.println("Enter the position");
			pos=s.nextInt();
			str.insert(pos, rep);
			System.out.println(str);
			cost=cost+4;
			System.out.println("Do u wanna proceed(y-1/n-0");
			menu=s.nextInt();
			break;
		case 3:
			//Delete
			System.out.println("Enter the position of char that to be deleted");
			pos=s.nextInt();
			str.deleteCharAt(pos);
			System.out.println(str);
			cost=cost+3;
			System.out.println("Do u wanna proceed(y-1/n-0)");
			menu=s.nextInt();
			break;	
		default:
			System.out.println("Wrong option....try correct");
			menu=1;
		}
		
	}
		System.out.println("Total cost is"+cost);
	}
}
