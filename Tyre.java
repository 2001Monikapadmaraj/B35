package org.tnsindia.inheritances.java;

public class Tyre extends BMW {

     private String tyre_name;
     public void display3()
     {
    	 System.out.println("The tyre name is: "+tyre_name);
	}
     //getters and getters
     
     public String getTyre_name() {
    	 return tyre_name;
    	 
     }
     public void setTyre_name(String tyre_name) {
    	 this.tyre_name = tyre_name;
    			 
     }
}
