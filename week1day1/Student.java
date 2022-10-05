package week1day1;

public class Student {
	
	public void report() {
	   String studentname="RAJA";
	   int rollNo=1046;
	   long regNo=1742372457l;
	   String bloodGroup="a+ve";
	   String department="IT";
	   double cgpa=7.66666d;
	   
        System.out.println("Student name: "+studentname); 
		System.out.println("roll no : "+rollNo);
		System.out.println("REG NO : "+regNo);
		System.out.println("blood group : "+bloodGroup);
		System.out.println("Department : "+department);
		System.out.println("overall cgpa : "+cgpa);
	}
		
		public static void main(String[] args) {
			Student file=new Student();
			file.report();
			
			
		}
	}


