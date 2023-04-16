package AutowiringWithConsrructor;

public class Address {
	private String addr;

	public Address(String addr) {
		super();
		this.addr = addr;
	}

	public Address() {
		super();
		System.out.println("Address class Constructor");
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + "]";
	}
	
	
	
	
}
