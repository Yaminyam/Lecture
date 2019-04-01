/******************************
*
* ��ǻ�����α׷��� 1 (11) HW11
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Shape {
	protected double x, y;

	public Shape(double x, double y) {		//Shape ������
		this.x = x;
		this.y = y;
	}
	
	public void print() {		//toString
		System.out.println();
	}
}

class TwoDimShape extends Shape {		//Shape�� ��ӹ��� TwoDimShape Ŭ����
	public double getArea() {		//2���������� ����
		return 0;
	}
	
	public TwoDimShape(double x, double y) {	//TwoDimShape ������
		super(x, y);
	}
}

class ThreeDimShape extends Shape {		//Shape�� ��ӹ��� ThreeDimShape Ŭ����
	protected double z;

	public double getVolume() {		//3���������� ����
		return 0;
	}
	
	public ThreeDimShape(double x, double y, double z) {	//ThreeDimShape ������
		super(x, y);
		this.z = z;
	}
}

class Ellipse extends TwoDimShape {		//TwoDimshape�� ��ӹ��� Ellipse Ŭ����
	int semiMinorAxis, semiMajorAxis;

	public double getArea() {		//Ÿ���� ����
		return 3.14 * semiMinorAxis * semiMajorAxis;
	}
	
	public void print() {		//Ellipse toString
		System.out.println("Ellipse   [ point : (" + x + ", " + y + ") area : " + getArea() + "]");
	}
	
	public Ellipse(double x, double y, int semiMinorAxis, int semiMajorAxis) {	//Ellipse ������
		super(x, y);
		this.semiMinorAxis = semiMinorAxis;
		this.semiMajorAxis = semiMajorAxis;
	}
}

class Rectangle extends TwoDimShape {	//TwoDimShape�� ��ӹ��� Rectangle Ŭ����
	int width, height;

	public double getArea() {		//�簢���� ����
		return width * height;
	}
	
	public void print() {		//Rectangle toString
		System.out.println("Rectangle [ point : (" + x + ", " + y + ") area : " + getArea() + "]");
	}
	
	public Rectangle(double x, double y, int width, int height) {		//Rectangle ������
		super(x, y);
		this.width = width;
		this.height = height;
	}
}

class Triangle extends TwoDimShape {	//TwoDimShape�� ��ӹ��� Triangle Ŭ����
	int base, height;

	public double getArea() {		//�ﰢ���� ����
		return (base * height) / 2;
	}
	
	public void print() {		//Triangle toString
		System.out.println("Triangle  [ point : (" + x + ", " + y + ") area : " + getArea() + "]");
	}
	
	public Triangle(double x, double y, int base, int height) {			//Triangle ������
		super(x, y);
		this.base = base;
		this.height = height;
	}
}

class Sphere extends ThreeDimShape {	//ThreeDimShape�� ��ӹ��� Sphere Ŭ����
	int radius;

	public double getVolume() {		//���� ����
		return 4 * (3.14 * Math.pow(radius, 3)) / 3;
	}
	
	public void print() {		//Sphere toString
		System.out.println("Shpere    [ point : (" + x + ", " + y + ", " + z + ") volume : " + getVolume() + "]");
	}
	
	public Sphere(double x, double y, double z, int radius) {			//Sphere ������
		super(x, y, z);
		this.radius = radius;
	}
}

class Cube extends ThreeDimShape {		//ThreeDimShape�� ��ӹ��� Cube Ŭ����
	int width, length, height;

	public double getVolume() {		//����ü�� ����
		return width * length * height;
	}
	
	public void print() {		//Cube toString
		System.out.println("Cube      [ point : (" + x + ", " + y + ", " + z + ") volume : " + getVolume() + "]");
	}
	
	public Cube(double x, double y, double z, int width, int length, int height) {	//Cube ������
		super(x, y, z);
		this.width = width;
		this.length = length;
		this.height = height;
	}
}

class Cylinder extends ThreeDimShape {		//ThreeDimShape�� ��ӹ��� Cylinder Ŭ����
	int radius, height;

	public double getVolume() {		//������� ����
		return 3.14 * Math.pow(radius, 2) * height;
	}
	
	public void print() {		//Cylinder toString
		System.out.println("Cylinder  [ point : (" + x + ", " + y + ", " + z + ") volume : " + getVolume() + "]");
	}
	
	public Cylinder(double x, double y, double z, int radius, int height) {		//Cylinder ������
		super(x, y, z);
		this.radius = radius;
		this.height = height;
	}
}
