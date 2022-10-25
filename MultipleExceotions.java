package com.w3spoint;
 
public class MultipleExceptions {
	public static void main(String args[]){
		try{    
            int array[] = new int[5];    
            array[5] = 20/0;    
        }    
        catch(ArithmeticException e){  
        	System.out.println("ArithmeticException catch block");
            System.out.println(e.getMessage());  
        }    
        catch(ArrayIndexOutOfBoundsException e){ 
        	System.out.println("ArrayIndexOutOfBoundsException catch block");
            System.out.println(e.getMessage());  
        }    
        catch(Exception e){  
        	System.out.println("Exception catch block");
            System.out.println(e.getMessage());  
        }    
	}
}