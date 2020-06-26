package com.clearcode.po;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {
//	public static By username_ip = By.id("authUse");
//	public static By pwd_ip = By.id("clearPass");
//	public static By login_btn = By.className("fa-sign-in");
//	
//	public static By student_rbutton = By.xpath("//input[@value='5']");
//	public static By fname_ip = By.id("registration_firstname");
//	public static By lname_ip = By.id("registration_lastname");
	
	public static By cust_button = By.xpath("//*[@id=\"customer\"]/a/i");
//	driver.findElement(By.linkText("Request a demo")).click();
	public static By custgrp_button = By.xpath("//*[@id=\"customer\"]/ul/li[2]/a");
	public static By add_button = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a");
	public static By cgname_ip = By.xpath("//*[@id=\"form-customer-group\"]/div[1]/div/div/input");
	public static By desc_ip = By.id("input-description1");
	public static By radio_button = By.xpath("//*[@id=\"form-customer-group\"]/div[3]/div/label[1]/input");
	public static By save_button = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button/i");
	public static By title_ip = By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
	
	
	public static By custl_button = By.xpath("//*[@id=\"customer\"]/ul/li[1]/a");
	public static By addcust_button = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a/i");
	public static By cg_ip = By.id("input-customer-group");
	public static By cfname_ip = By.id("input-firstname");
	public static By clname_ip = By.id("input-lastname");
	public static By cemail_ip = By.id("input-email");
	public static By ctelephone_ip = By.id("input-telephone");
	public static By cpwd_ip = By.id("input-password");
	public static By cconfirmpwd_ip = By.id("input-confirm");
	public static By csave_button = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
	public static By ctitle_ip = By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
	
	
	
}
