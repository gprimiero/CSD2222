
	public class Student {

		private String name; // name has default value null
		private int age; // age has default value 0
		private char gender; // c has default value '\u0000'
		private String programme; // 

		// construct a student 
		public Student(String name, int age){	
			this.name = name;
			this.age = age;
		}
		
		public void displayStudentDetails() {
			System.out.println("Name: " + name + " Age: " + age);
		} 
	}


