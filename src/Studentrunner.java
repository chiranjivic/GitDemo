import java.lang.*;
public class Studentrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks = {50,60,80};
		
	
		
		Student student = new Student ("Ron",marks);
		
		System.out.println(student.getNumberOfMarks());
		System.out.println(student.getTotalSumOfMarks());
		System.out.println(student.getMax());
		System.out.println(student.getMin());
		System.out.println(student.getName());
	}
}
