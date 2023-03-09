package iteratorpattern;

public class Employee1 implements Comparable<Employee1> {
	private int eId;
	private String eName;
	private String address;
	private float salary;
	private static int idgen=1001;
	public Employee1()
	{
		eId=idgen++;
	}
	public Employee1(String eName,String address,float salary )
	{
		this();
		this.eName=eName;
		this.address=address;
		this.salary=salary;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static int getIdgen() {
		return idgen;
	}
	public static void setIdgen(int idgen) {
		Employee1.idgen = idgen;
	}
	@Override
	public String toString(){
		return "Employee[eId="+eId+",eName="+eName+",address="+address+",salary="+salary+"]";
	}
	
	@Override
	public int compareTo(Employee1 e) {
		return Float.compare(salary, e.getSalary());
		//return eName.compareTo(e.geteName());
		//return address.compareTo(e.getAddress());
	}

}
