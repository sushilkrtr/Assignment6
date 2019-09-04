import java.io.Serializable;

public class Student implements Serializable{
int no;
String name;
int marks;


public String toString() {
	return "Student [no=" + no + ", name=" + name + ", marks=" + marks +"]";
}


public Student(String name,int no,int marks)
    {
	this.name=name;
	this.no=no;
	this.marks=marks;
	}

}
