import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readfile {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		
		FileWriter fout=new FileWriter("test1");
//		char ch='e';
	    InputStreamReader finn=new InputStreamReader(System.in);
	    BufferedReader bf=new BufferedReader(finn);
		System.out.println("Enter charachter to input");
		String str=bf.readLine();
		fout.write(str);
		String str2=bf.readLine();
		fout.write(str2);
		String str3=bf.readLine();
		fout.write(str3);
		fout.close();
//		System.out.println(str);
//		String gg="Hi There ! I am wrinting on to a file ";
//		FileInputStream fin=new FileInputStream("test1");
		FileReader fin=new FileReader("test1");
		BufferedReader bt=new BufferedReader(fin);
        String str1;
		
		while((str1=bt.readLine())!=null)
		{
			System.out.println(str1+"/n");	
			
		}
		fin.close();
		
	}
	
}
