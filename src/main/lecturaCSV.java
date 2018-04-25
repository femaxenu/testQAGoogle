package com.seidor.qa.testWebQA;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class lecturaCSV {
	
	
	
	public void llegirCSV(WebDriver driver, File file){
		
	      // this gives you a 2-dimensional array of strings
	      List<List<String>> lines = new ArrayList<>();
	      //DECLAREM L'SCANNER (PER PODER LLEGIR FITXERS)
	      Scanner inputStream;
	      
		try{
			System.out.println("entro dintre try");
			inputStream = new Scanner(file);
			
	          while(inputStream.hasNext()){
	              String line= inputStream.next();
	              String[] values = line.split(",");
	              // this adds the currently parsed line to the 2-dimensional string array
	              System.out.println(line);
	              
	              WebElement element = driver.findElement(By.name("q"));
	              element.sendKeys(line);
	              element.submit();
	              TimeUnit.SECONDS.sleep(3);
	              lines.add(Arrays.asList(values));
	              
	              driver.findElement(By.name("q")).clear();;
	             
	          }

	          System.out.println(lines);
	          inputStream.close();
	      }catch (FileNotFoundException e) {
	          e.printStackTrace();
	      } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
