
public class Student_2 {
		private String name;
		public Student_2(String name) {
			this.name=name;
		}
		public Student_2() {
			this.name="unknown";
		}
		@Override
		public String toString() {
			return "Student_2 [name=" + name + "]";
		}
		public static void main(String arg[]) {
			
			Student_2 ab=new Student_2("Shehjan");
			
			Student_2 as=new Student_2();
			
			System.out.println(ab);
			
			System.out.println(as);
			
			//Declaration Of Array Of Object
			Student_2[] s1=new Student_2[5];
			for(int i=0;i<4;i++) {
				s1[i]=new Student_2("stud" + i);
				System.out.println(s1[i]);
			}
		}

}
