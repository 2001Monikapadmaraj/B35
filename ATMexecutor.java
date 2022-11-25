package org.tnsindia.PackageExecutor.java;
import java.util.Scanner;

import org.tnsindia.Package.java.ATM;
public class ATMexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try (Scanner s = new Scanner(System.in)){
        	System.out.println("enter the card no:");
        	String card_no=s.next();
        	ATM obj=new ATM();
        	obj.display(card_no);
         }
	}

}
