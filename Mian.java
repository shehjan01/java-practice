package practice2;

public class Mian {

	public static void main(String[] args) {
	     Rectangle rect = new Rectangle(10, 20);
	     System.out.println("Initial: " + rect);

	     rect.resizeWidth(30);
	     rect.resizeHeight(40);
	     System.out.println("Resized: " + rect);
	 }
}
