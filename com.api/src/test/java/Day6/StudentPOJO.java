package Day6;

public class StudentPOJO {
	
	int id;
	String name;
	String location;
	String phone;
	String courcess[];
	public String[] getCourcess() {
		return courcess;
	}
	public void setCourcess(String[] courcess) {
		this.courcess = courcess;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
