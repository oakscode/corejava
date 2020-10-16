package com.oakscode;
import java.util.*; 
public class Cast_Object { 
	  
    public static Object obj; 
  
    public static void main(String[] args) 
        throws ClassNotFoundException 
    { 
  
        // returns the Class object for this class 
        Class myClass = Class.forName("Cast_Object"); 
  
        System.out.println("Class represented by myClass: "
                           + myClass.toString()); 
  
        // Cast the object obj to object of myClass 
        // using cast() method 
        System.out.println("Object " + obj + " after cast "
                           + "upon to class Test: "
                           + myClass.cast(obj)); 
    } 
} 