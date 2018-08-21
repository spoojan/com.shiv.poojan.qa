package practice;

import java.util.Scanner;

public class CompareStringLexicograhically {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
		 /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());        
        if(A.compareTo(B)!=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }                 
  
      System.out.println(A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0)))+" "+B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0))));
        // System.out.println(B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0))));
        
	}

}
