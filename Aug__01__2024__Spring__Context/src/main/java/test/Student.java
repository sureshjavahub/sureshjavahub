package test;

public class Student {
	public Student() {
		
	}

	private Integer id;
	private String name;
	private Float fee;

	public Student(Integer id, String name, Float fee) {

		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}
	
	public void setHello(Student s)
	{
		this.id=s.getId();
		this.name=s.getName();
		this.fee=s.getFee();
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

}
