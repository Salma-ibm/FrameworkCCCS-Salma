package com.clearcode.po;

import org.openqa.selenium.By;

public class ProductPage {
	
	public static By category_button = By.xpath("//*[@id=\"catalog\"]/a/i");
//	driver.findElement(By.linkText("Request a demo")).click();
	public static By product_button = By.xpath("//*[@id=\"catalog\"]/ul/li[2]/a");
	public static By addprod_button = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a/i");
	public static By prodname_ip = By.id("input-name1");
	public static By mtitle_ip = By.id("input-meta-title1");
	
	public static By data_button = By.xpath("//*[@id=\"form-product\"]/ul/li[2]/a");
	public static By model_ip = By.id("input-model");
	public static By price_ip = By.id("input-price");	
	public static By qty_ip = By.id("input-quantity");
	
	public static By link_button = By.xpath("//*[@id=\"form-product\"]/ul/li[3]/a");
	public static By category_ip = By.xpath("//*[@id=\"input-category\"]");
	
	public static By discount_button = By.xpath("//*[@id=\"form-product\"]/ul/li[7]/a");
	public static By adddisc_button = By.xpath("//*[@id=\"discount\"]/tfoot/tr/td[2]/button/i");
	public static By qty1_ip = By.xpath("//*[@id=\"discount-row0\"]/td[2]/input");
	public static By price1_ip = By.xpath("//*[@id=\"discount-row0\"]/td[4]/input");
	
	public static By dstart_ip = By.xpath("//*[@id=\"discount-row0\"]/td[5]/div/input");
	public static By cdsicon_button = By.xpath("//*[@id=\"discount-row0\"]/td[5]/div/span/button/i");
	public static By ctoday_button = By.xpath("/html/body/div[5]/div/div[1]/table/tbody/tr[4]/td[3]");
	
	public static By dend_ip = By.xpath("//*[@id=\"discount-row0\"]/td[6]/div/input");
	public static By cdeicon_button = By.xpath("//*[@id=\"discount-row0\"]/td[6]/div/span/button/i");
	public static By ctommo_button = By.xpath("/html/body/div[6]/div/div[1]/table/tbody/tr[4]/td[4]");
	
	
	public static By reward_button = By.xpath("//*[@id=\"form-product\"]/ul/li[10]/a");
	public static By point_ip = By.id("input-points");
	
	public static By psave_button = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button/i");
	
	public static By ptitle_ip = By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
	

	
	
}
