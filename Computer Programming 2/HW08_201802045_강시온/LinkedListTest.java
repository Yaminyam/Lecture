
public class LinkedListTest {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		for(int i=0;i<20;i++)
			list.addLast(i);
		System.out.println("����Ʈ: " + list);
		System.out.println("removeFirst() ȣ��: "+ list.removeFirst());
		System.out.println("removeLast() ȣ��: " + list.removeLast());
		System.out.println("remove(4) ȣ��: " + list.remove(4));
		System.out.println("����� ����Ʈ: " + list);
		System.out.println("get(5) ȣ��: " + list.get(5));
		System.out.println("set(5) ȣ��: " + list.set(5, 6));
		System.out.println("����� ����Ʈ: " + list);
		System.out.println("indexOf(6) ȣ��: " + list.indexOf(6));
	}
}
