package com.seidor.qa.testWebQA;

//Selenium
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Args;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//Finish import Selenium


//Import CSV
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//finish import CSV


public class App {
   public static void main(String[] args) {
	   System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		  // WebDriver driver = new 
	    //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //Launch website
	    driver.navigate().to("https://www.google.com/?gws_rd=ssl");
	    
	    //Maximize the browser
	    driver.manage().window().maximize();
		
		 //declarem ruta del CSV
	    String fileName= "C:\\Users\\fserra\\Desktop\\read_ex.csv";
	    //ASSOSSIEM LA RUTA DEL CSV PERQU� HI ACCEDEIXI LA FUNCIO FILE
	    File file= new File(fileName);

	   lecturaCSV b = new lecturaCSV();
	   b.llegirCSV(driver, file);
	   
   }
 }
