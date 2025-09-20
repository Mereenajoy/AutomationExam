package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;

public class HomePageTest extends BaseClass {
	
	
	@Test(priority=1)
	public void titleTest() {
		String title = home.TitleVerification();
		System.out.println(title +"title");
	}
	
	@Test(priority=2)
	public void property() {
		home.findProperty();
	}
	
	@Test(priority=3)
	public void logoVerificationTest() {
		home.logoVerification();
	}
	
	@Test(priority=4)
	public void viewDetailsTest() {
		home.clickViewDetails();
	}
	
	@Test(priority=5)
	public void QuickContactTest() {
		home.setName("mereena joy");
		home.setPhno("9674827434");
		home.setEmail("m@gmail.com");
		home.setSummary("33x3f3xwszxde");
		home.submit();
		
	}
//
//	
	

}
