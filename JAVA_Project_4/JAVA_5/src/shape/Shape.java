package shape;

import java.awt.print.Printable;

public class Shape {
	//x,y
	private int x;
    private int y;
    
    public Shape(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    public void print() {
    	System.out.println("좌표(x,y)=("+x +"," + y+")");
    }

    

}
