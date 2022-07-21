package org;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args)
	{
		List<Circle> circleList = new ArrayList();
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		Circle c4 = new Circle();
		circleList.add(c1);
		circleList.add(c2);
		circleList.add(c3);
		circleList.add(c4);
		ShapeTest obj = new ShapeTest();
		obj.drawShapes(circleList); //draws for all 4 of them
		
		List<Triangle> triangleList = new ArrayList();
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Triangle t3 = new Triangle();
		Triangle t4 = new Triangle();
		obj.drawShapes(triangleList);
	}

}
