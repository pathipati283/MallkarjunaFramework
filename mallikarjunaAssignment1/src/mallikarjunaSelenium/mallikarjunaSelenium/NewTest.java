package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "getData")
  public void login(String Username,String Password)
  {
	  System.out.println(Username);
	  System.out.println(Password);
    }
  @DataProvider
  public Object[][] getData()
  {
	  Object[][] data=new Object[3][2];
	  data[0][0]="UserName1";
	  data[0][1]="Password1";
	  data[1][0]="UserName2";
	  data[1][1]="Password1";
	  data[2][0]="UserName3";
	  data[2][1]="Password1";
			return data;										  
			  
	  
  }
  }

