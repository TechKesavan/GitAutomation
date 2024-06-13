package sikulipack;

import org.testng.annotations.Test;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class DesktopAuto {
	Screen sc=new Screen();
	
  @Test
  public void windowWifiClick() throws SikuliException, Exception {
	  sc.click("C:\\Users\\Home\\Pictures\\spic\\win.PNG");
	  Thread.sleep(2000);
	  sc.click("C:\\Users\\Home\\Pictures\\spic\\arrow.PNG");
	  Thread.sleep(2000);
	  sc.type("C:\\Users\\Home\\Pictures\\spic\\search.PNG","king");
	  
  }
 
}
