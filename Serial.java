import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException
	{
		
		FileOutputStream fout=new FileOutputStream("studentData");
		ObjectOutputStream oot=new ObjectOutputStream(fout);
		
		Student s1=new Student("Ankit",987654,465);
		
		oot.writeObject(s1);
		oot.close();
		
		FileInputStream fin=new FileInputStream("studentData");
		ObjectInputStream ooi=new ObjectInputStream(fin);
		
		Student stu=(Student) ooi.readObject();
		System.out.println(stu);
	}
}
