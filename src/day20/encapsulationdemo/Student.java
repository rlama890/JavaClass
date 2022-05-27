package day20.encapsulationdemo;

public class Student {
	
	String stuName;
	int roll;
	
//	public Student(String stuName, int roll) {
//		stuName = this.stuName;
//		roll = this.roll;
//	}
		
//	valid
//	public Student(String s, int r) {
//		stuName = s;
//		roll = r;
//	}
	public Student(String stuName, int roll) {
		this.stuName = stuName;
		this.roll = roll;
	
	}
	public void displayinfo() {
		System.out.println("student name is:" +stuName);
		System.out.println("Roll is:"+roll);
	}

	public static void main(String[] args) {
		Student s1 = new Student("ram",22);
		s1.displayinfo();

	}

}
