package com.clearcode.testsuite;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.ProductPage;
import com.clearcode.po.CustomerPage;

import dataProvider.LoginData;

public class TestSuite2 extends TestSetup{
//String headerdesc, String prodname, String mtitle,String model, String price, String qty, String category,String qty1,String price1,String point
//	@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
 @Test(dataProvider="createStudent1", dataProviderClass=LoginData.class) 
   // @Test
	public void CreateCCGroup(String headerdesc, String prodname, String mtitle,String model, String price, String qty, String category,String qty1,String price1,String point) throws InterruptedException {
		wdu.type(HomePage.username_ip, "admin");
		wdu.type(HomePage.pwd_ip, "admin@123");
		Thread.sleep(3000);
		wdu.click(HomePage.login_btn);
		
		wdu.mouseOver(ProductPage.category_button);
		wdu.click(ProductPage.product_button);
		wdu.click(ProductPage.addprod_button);
		wdu.type(ProductPage.prodname_ip, prodname);
		wdu.type(ProductPage.mtitle_ip, mtitle);
		
		wdu.click(ProductPage.data_button);
		wdu.type(ProductPage.model_ip, model);
		wdu.type(ProductPage.price_ip, price);
		wdu.type(ProductPage.qty_ip, qty); 
		
		wdu.click(ProductPage.link_button);
	//	wdu.selectByVisibleText(ProductPage.category_ip, category);//need to modify
		wdu.type(ProductPage.category_ip, category);
		
		wdu.click(ProductPage.discount_button);
		wdu.click(ProductPage.adddisc_button);
		wdu.type(ProductPage.qty1_ip, qty1);
		wdu.type(ProductPage.price1_ip, price1);		
//    	wdu.type(ProductPage.dstart_ip, "2020-06-23"); //need to modify
//		wdu.type(ProductPage.dend_ip, "2020-06-24"); //need to modify
//		
//		Date dt = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       // System.out.println(sdf.format(dt));
      //  Thread.sleep(1000);
		wdu.click(ProductPage.cdsicon_button);
        wdu.click(ProductPage.ctoday_button);
        wdu.click(ProductPage.cdeicon_button);
        wdu.click(ProductPage.ctommo_button);
        
		
		wdu.click(ProductPage.reward_button);
		wdu.type(ProductPage.point_ip, point);
		
		wdu.click(ProductPage.psave_button);
    //    wdu.assertText(ProductPage.ptitle_ip, " Success: You have modified products!      ");
////		wdu.assertTitle("Success: You have modified customer groups! ×");
//		System.out.println(prodname);
//        System.out.println(" Success: You have modified products!      ");
////     
  //	wdu.exit();
//     	
     	
	
	
		//@Test
//		public void CreateCCGroup() throws InterruptedException {
//			wdu.type(HomePage.username_ip, "admin");
//			wdu.type(HomePage.pwd_ip, "admin@123");
//			Thread.sleep(3000);
//			wdu.click(HomePage.login_btn);
//			
//			wdu.mouseOver(ProductPage.category_button);
//			wdu.click(ProductPage.product_button);
//			wdu.click(ProductPage.addprod_button);
//			wdu.type(ProductPage.prodname_ip, "White Shirt");
//			wdu.type(ProductPage.mtitle_ip, "White Shirt");
//			
//			wdu.click(ProductPage.data_button);
//			wdu.type(ProductPage.model_ip, "SHI-201");
//			wdu.type(ProductPage.price_ip, "800");
//			wdu.type(ProductPage.qty_ip, "5"); //need to add qty in data sheet
//			
//			wdu.click(ProductPage.link_button);
//		//	wdu.selectByVisibleText(ProductPage.category_ip, "Sports");
//		    wdu.type(ProductPage.category_ip, "Sports");
//			
//			wdu.click(ProductPage.discount_button);
//			wdu.click(ProductPage.adddisc_button);
//			wdu.type(ProductPage.qty1_ip, "5");
//			wdu.type(ProductPage.price1_ip, "700");		
////			wdu.type(ProductPage.dstart_ip, "2020-06-23"); //need to modify
////			wdu.type(ProductPage.dend_ip, "2020-06-24"); //need to modify
//		wdu.click(ProductPage.cdsicon_button);
//        wdu.click(ProductPage.ctoday_button);
//        wdu.click(ProductPage.cdeicon_button);
//        wdu.click(ProductPage.ctommo_button);
////			
//			wdu.click(ProductPage.reward_button);
//			wdu.type(ProductPage.point_ip, "10");
//			
//			wdu.click(ProductPage.psave_button);
//////	      wdu.assertText(CustomerPage.title_ip, "Success: You have modified customer groups! ×");
//////			wdu.assertTitle("Success: You have modified customer groups! ×");
//////	     	System.out.println("Success: You have modified customer groups! ×");
//////	     	System.out.println(cgname);
//////	    	wdu.exit();
			
		}
}
	     	