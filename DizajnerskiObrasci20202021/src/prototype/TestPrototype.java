package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {
	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.RED);

		LineShallow line = new LineShallow(p1, p2, Color.RED);

		LineShallow lineClone = line.clone();

		System.out.println(line);
		System.out.println(lineClone);

		line.getStartPoint().setX(100);

		System.out.println(lineClone.getStartPoint().getX());

		LineDeep lineDeep = new LineDeep(p1, p2, Color.RED);

		LineDeep lineDeepClone = lineDeep.clone();

		System.out.println(lineDeep);
		System.out.println(lineDeepClone);

		lineDeep.getStartPoint().setX(200);

		System.out.println(lineDeepClone.getStartPoint().getX());

	}

}
