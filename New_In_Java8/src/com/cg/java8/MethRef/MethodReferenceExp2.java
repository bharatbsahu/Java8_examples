package com.cg.java8.MethRef;

@FunctionalInterface
interface Sayable1{  
    void say();  
}  


public class MethodReferenceExp2 {  
	
	
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    
    
    public static void main(String[] args) {  
    	
    	MethodReferenceExp2 methExp2 = new MethodReferenceExp2();
    	
    	Sayable1 say1 = methExp2::saySomething;
    	say1.say();
    	
    	
    	Sayable1 say2 = new MethodReferenceExp2()::saySomething;
    	say2.say();
    }
}
