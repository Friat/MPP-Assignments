package schoolLabusinglambda;

public class Course {

		private String title;
		private String number;
		private int units;
		private Faculty faculty1;
		
		public Course(String title, String number, int units, Faculty faculty1) {
			//super();
			this.title = title;
			this.number = number;
			this.units = units;
			this.faculty1 = faculty1;
		}
	
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String getNumber() {
			return number;
		}
	
		public void setNumber(String number) {
			this.number = number;
		}
	
		public int getUnits() {
			return units;
		}
	
		public void setUnits(int units) {
			this.units = units;
		}
	
		public Faculty getFaculty1() {
			return faculty1;
		}
	
		public void setFaculty1(Faculty faculty1) {
			this.faculty1 = faculty1;
		}
		
		
	}
