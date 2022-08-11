package Test01;

import org.testng.annotations.Test;

public class NewTest  {
  @Test
  public void f() {
	  System.out.println("dfsdfsdf");
	  
	  try {
		int a = 100;
		  int b = 0;
		  
		  System.out.println("result is : " + (a/b));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
  }
}
