
public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();															//ù��° ��ȭ ��ü
		Movie m2 = new Movie("The NoteBook", "Nick Cassavetes", "New Line Cinema");		//�ι�° ��ȭ ��ü
		
		//���
		System.out.println("m1(no parameter) : "+m1.getTitle()+" / "+m1.getProducer()+" / "+m1.getCompany());
		System.out.println("m2(3 parameter) : "+m2.getTitle()+" / "+m2.getProducer()+" / "+m2.getCompany());
	}
}
