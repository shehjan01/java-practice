package practice2;

class Rectangle implements Resizable {
	 private int width;
	 private int height;

	 public Rectangle(int width, int height) {
	     this.width = width;
	     this.height = height;
	 }

	 @Override
	 public void resizeWidth(int width) {
	     this.width = width;
	 }

	 @Override
	 public void resizeHeight(int height) {
	     this.height = height;
	 }

	 public int getWidth() {
	     return width;
	 }

	 public int getHeight() {
	     return height;
	 }

	 @Override
	 public String toString() {
	     return "Rectangle [width=" + width + ", height=" + height + "]";
	 }
	}