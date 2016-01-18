package lab_2;

public class Person 
{	
		protected String name;
		protected String phonenumber;
		protected int age;
		
		public Person(String name, String phonenumber, int age) {
			//super();
			this.name = name;
			this.phonenumber = phonenumber;
			this.age = age;
		}
		public Person()
		{
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		
		
		
	}

