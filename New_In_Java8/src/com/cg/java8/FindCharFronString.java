package com.cg.java8;

public class FindCharFronString {

	public static void main(String[] args) {
		
        // String in which a character to be searched. 
        String str = "GeeksforGeeks is a computer science portal"; 
        
        int count = 0;  
        int count1 = 0; 
        
        for(int i = 0; i < str.length(); i++) {    
        	
        	if (str.charAt(i) == 'G' ) {
        		count ++;
        	}
        	
        	if (str.charAt(i) != ' ' ) {
        		count1 ++;
        	}
    	   
       }
        
        System.out.println("Total number of characters in a string: " + count1);    
        System.out.println("Total number of characters-G in a string: " + count);  
	}

}
