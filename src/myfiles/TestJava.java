package myfiles;
import java.util.*;

import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestJava{
	
	 String h = "hello";

@BeforeClass
void CDE()	
{
	System.out.println("You are in before class");
}

@AfterClass
void DEF()	
{
	System.out.println("you are in after class");
}
@Test()
void GHI()	
{
	System.out.println("you are in test");
}
@BeforeTest()	
void ABC()	
{
	System.out.println("you are in before test");
} 



@BeforeSuite()	
void MMM()	
{
	System.out.println("you are in before suite");
} 

@AfterTest()	
void XYZ()	
{
	System.out.println("you are in after test");
} 

@AfterSuite()	
void LKJ()	
{
	System.out.println("you are in after suite");
} 

}
