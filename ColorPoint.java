import java.awt.Color;

public class ColorPoint extends Point {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return cp.color.equals(color) && super.equals(o);
	}
}
