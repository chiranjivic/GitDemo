
public class Student {

	
	private String name ;
	private int[] marks ;
	
	
	
	public Student(String string, int... marks) {
		
		
		this.name= name ;
		this.marks=marks;
	}
	
		
		 public int getNumberOfMarks() {
			return marks.length ;
		}
		 
		 public int getTotalSumOfMarks() {
			int sum=0;
			for (int i=0;i<marks.length;i++)
			{
				sum+=marks[i];
			}
			return sum ;
			
			 }
		 
		 public int getMax() {
				int max=0;
				for (int mark : marks)
				{
					if(mark>max)
						max=mark;
				}
				return max ;
		 }
		 public int getMin() {
				int min=Integer.MAX_VALUE;
				for (int mark : marks)
				{
					if(mark<min)
						min=mark;
				}
				return min ;
		 }


		public char[] getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}


