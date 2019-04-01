/******************************
*
* ��ǻ�����α׷��� 1 (11) HW11
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class ShapeTest {
	public static Shape arrayOfShapes[];	//Shape ��ü �迭

	public static void main(String[] args) {
		init();
		drawAll();
	}

	public static void init() {
		arrayOfShapes = new Shape[6];
		arrayOfShapes[0] = new Ellipse(1, 6, 2, 1);		//Ellipse ��ü ����
		arrayOfShapes[1] = new Rectangle(6, 8, 5, 10);	//Rectangle ��ü ����
		arrayOfShapes[2] = new Triangle(3, 4, 5, 10);	//Triangle ��ü ����
		arrayOfShapes[3] = new Sphere(3, 4, 1, 2);		//Sphere ��ü ����
		arrayOfShapes[4] = new Cube(1, 1, 2, 5, 3, 4);	//Cube ��ü ����
		arrayOfShapes[5] = new Cylinder(6, 2, 3, 1, 1);	//Cylinder ��ü ����
	}

	public static void drawAll() {		//��� Shape ��ü ���� ���
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].print();
		}
	}
}
