import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ao=new Scanner(System.in);
		String[] ab=new String[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter The Student Name:- ");
			ab[i]=ao.nextLine();
		}
		for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + ab[i]);
        }

		ao.close();
	}

}
