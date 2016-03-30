import java.awt.Color;

public class Test {
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		ColorPoint cp = new ColorPoint(10, 10, Color.RED);
		System.out.println(cp.equals(p));
		System.out.println(p.equals(cp));
	}

}
