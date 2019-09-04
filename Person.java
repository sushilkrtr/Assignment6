import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class Person {
	
	String pname;
	int salary;
	int no;
public static void main(String[] args) throws IOException,FileNotFoundException
{
	
	FileWriter fout=new FileWriter("PDetail");
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	System.out.println("Enter Name of Person");
	String pname=br.readLine();
	System.out.println("Enter Salary of Person");
	String salary=br.readLine();
	System.out.println("Enter number of Person");
	String no=br.readLine();
	fout.write(pname);
	fout.write(salary);
	fout.write(no);
	fout.close();
	
	FileReader fin=new FileReader("PDetail");
	BufferedReader bt=new BufferedReader(fin);
	String p;
	while((p=bt.readLine())!=null)
	{
		System.out.println(p+"\n");
	}
	
	
}

}
