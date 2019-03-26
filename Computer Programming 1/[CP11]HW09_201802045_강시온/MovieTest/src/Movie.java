
public class Movie {
	private String title;
	private String producer;
	private String company;
	
	public String getTitle() {				//title ������
		return title;
	}

	public void setTitle(String title) {	//title ������
		this.title = title;
	}

	public String getProducer() {			//producer ������
		return producer;
	}

	public void setProducer(String producer) {		//producer ������
		this.producer = producer;
	}

	public String getCompany() {			//company ������
		return company;
	}

	public void setCompany(String company) {	//company ������
		this.company = company;
	}

	public Movie() {						//0�� ���� ������
		title = "The Holiday";
		producer = "Nancy Meyers";
		company = "Columbia Pictures";
	}
	
	public Movie(String t, String p, String c) {	//3�� ���� ������
		title = t;
		producer = p;
		company = c;
	}
}
