package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args)  
	{
		try
		{
			/*
		//step 1 : create file object
		File f=new File("G:\\File\\Hello.txt");
		System.out.println("File name is : "+f.getName());
		System.out.println("File path is : "+f.getPath());
		System.out.println("File exists : "+f.exists());
		
		//step 2 : create FileReader object
		FileReader fr = new FileReader(f);
	    int i = fr.read();
		while(i!=-1) 
		{
			System.out.print(i+",");
			i=fr.read();			
		} 
		
		//step 3 : create BufferedReader object
		BufferedReader br=new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null) 
		{
			System.out.print(line);
			line=br.readLine();			
		}
		br.close();
		fr.close(); */
			
			//using Files to read
			//variable declaration
			var allLines = Files.readAllLines(Paths.get("G:\\File\\Hello.txt"));
			boolean isFound = false;
			Scanner obj = new Scanner(System.in);
			String name;
			int score=0;
			
			//read data from user
			System.out.println("Enter student name:"); 
			name=obj.next();
			
			//logic
			for(var a:allLines)
			{
				var data=a.split(",");
				if(data[0].equals(name))
				{
					score=Integer.parseInt(data[1]);
					isFound=true;
					break;
					
				}	
				
				
			}
			if(isFound)
				System.out.println("student score is :"+score);
			else
				System.out.println("student score is :"+score);
			
			
			obj.close();
		}
		catch(Exception e)
		{
			
		}
		
		//to write into the file
		try
		{
			FileWriter fw=new FileWriter("G:\\File\\Hello.txt");
			fw.write("MANDEEP,80\n");
			fw.write("AMANDEEP,97\n");
			fw.write("RAMANDEEP,27\n");
			fw.write("SANDEEP,100\n");
			fw.write("SINGH,99\n");
			fw.write("SINDHU,99\n");
			fw.close();
			System.out.println("file writing done");
		}
		catch(Exception e)
		{
				
		}

	}

}
