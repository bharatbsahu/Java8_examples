package com.java8.methref;

@FunctionalInterface 
interface Sayable3{  
    void say(String msg);  
}  

public class MethodReference {  

    public static void saySomething(String msg){  
        System.out.println("Hello, this is static method.");  
    }  
    
    public static void main(String[] args) {  
        // Referring static method  
    	Sayable3 sayable = MethodReference::saySomething;
        // Calling interface method  
        sayable.say("HI");  
    }  
}  
