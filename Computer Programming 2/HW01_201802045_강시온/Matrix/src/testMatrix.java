
public class testMatrix {
	public static void main(String[] args) {
		Matrix mat1 = new Matrix(3, 2);
		mat1.setMatrix(1, -2);
		mat1.setMatrix(3, 4);
		mat1.setMatrix(5, 6);
		Matrix mat2 = new Matrix(2, 3);
		mat2.setMatrix(1,2,3);
		mat2.setMatrix(4,5,6);

		System.out.println("ù��° ���");
		mat1.print();
		System.out.println();
		System.out.println("�ι�° ���");
		mat2.print();
		System.out.println();
		System.out.println("�� ����� ����");
		mat1.multiMatrix(mat2).print();
		System.out.println();
		System.out.println("ù��° ��� + ù��° ���");
		mat1.addMatrix(mat1).print();
		
		System.out.println();
		System.out.println("�ι�° ����� ��ġ���");
		mat2.transposed().print();
	}
}
