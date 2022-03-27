package shape;

public class Square  extends Shape{
	  //중심(x,y) 가로(width) , 세로(height)
		private int width;
		private int height;
		public Square(int x, int y, int  width, int height) {
			super(x,y);
			this.width = width;
			this.height = height;
			
		}
	    @Override
	    public void print() {
	    	super.print();
	    	System.out.println("가로 : " + width);
	    	System.out.println("높이 : " + height);
	    }
	    @Override
	    public String toString() {
	    	return "사각형";
	    }
	}
