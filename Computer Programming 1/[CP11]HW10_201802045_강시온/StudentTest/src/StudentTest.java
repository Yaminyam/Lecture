/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("s1", 201800000, "cse", 4.0, 130);		//Student Ŭ������ s1 ��ü ����
		UnderGraduate u1 = new UnderGraduate("u1", 201801234, "cse", 3.8, 150, "argos");	//UnderGraduate Ŭ������ u1 ��ü ����
		Graduate g1 = new Graduate("g1", 201850000, "cse", 4.3, 90, "ETA", 0.8);		//Graduate Ŭ������ g1 ��ü ����
		Graduate g2 = new Graduate("g2", 201860000, "cse", 4.2, 60, "LTA", 0.6);		//Graduate Ŭ������ g2 ��ü ����
		
		System.out.println(s1.toString());		//s1 ��ü ���
		System.out.println();
		System.out.println(u1.toString());		//u1 ��ü ���
		System.out.println();
		System.out.println(g1.toString());		//g1 ��ü ���
		System.out.println();
		System.out.println(g2.toString());		//g2 ��ü ���
	}
}
