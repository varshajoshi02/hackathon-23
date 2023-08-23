package questions21_35;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class readfile_31 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File f = new File("1.txt");
		File f2 = new File("write.txt");
		File f1= new File("read.txt");
		f1.createNewFile();
		f2.createNewFile();// creating source and dest file
		 
		 FileReader fr = new FileReader(f1);
		 BufferedReader br = new BufferedReader(fr); // reading file
		 String ch=null;
		ArrayList<String> l= new ArrayList<String>();//storing each string in arraylist untill null
		while((ch=br.readLine())!=null) 
		{
			 System.out.println(ch);
			 l.add(ch);
			 }
		System.out.println(l);
		 FileWriter fw = new FileWriter(f2);
		for (int i =l.size()- 1; i >= 0; i--) { //reversing each string and write in destination file
			fw.write(l.get(i));
	        System.out.println(" \n ");
		      
	}
		
fw.close();
fr.close();
}
}
