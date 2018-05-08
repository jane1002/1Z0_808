package ch;
import java.io.IOException;   

public class ExceptionTryCatchTest {

 
	    public void doSomething() throws IOException{   
	        System.out.println("do somthing");   
	    }   
	    public static void main(String[] args){   
	        ExceptionTryCatchTest et = new ExceptionTryCatchTest();   
	        try {   
	            et.doSomething();   
	        }
	        
	        catch (IOException e) {   
	            //
	        }   catch (Exception e) {   
	            //

	    }  
	}  
}
