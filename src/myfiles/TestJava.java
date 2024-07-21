package myfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

import org.testng.annotations.*;

public class TestJava {
	
	int a;
	int b = 30;
	
	static int c = 30;
	
	TestJava(int a)
	{
		this.a = a;
		System.out.println(b);
		System.out.println(a);
		
	}
	
	static
	{
		System.out.println("Welcome to home");
	}

public static void main(String[] args) throws IOException {
		TestJava ts = new TestJava(20);
		
		
		
		
		

	}
}