import java.util.*;
import java.util.Scanner;
public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
/*		int n=10;
		
		
		System.out.println("iudhiuweuiewndewd");
do { 
	System.out.println("Eneter a no : ");
    n=sc.nextInt();
    if(n>=0)
	System.out.println(n*n*n);
    else 
    	continue;
}
	
while(n>=0);
	
*/
	/*	int n;
		int r=0;
		n=sc.nextInt();
	
		r=n%10;
		if(r==n)
			System.out.println("Enter no. with 2 or more digits");
		else
		System.out.println(r);
	*/	
		

	/*	int n;
		int r=0;
		n=sc.nextInt();
		
		while (n>=1)
		{
			n=n/10;
			r++;
		}
	System.out.println(r);
		*/
		
		String str ="Hello Ji";
		int l=0;
		l=str.length();
		
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)!=' ')
				System.out.println(str.charAt(i));
			else 
				continue;
		}
		

}
}