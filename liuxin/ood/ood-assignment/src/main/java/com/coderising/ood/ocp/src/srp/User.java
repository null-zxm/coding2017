package srp;

public class User {
	private String name;
	private String productDesc;
	private String adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public User(String name, String productDesc, String adress) {
		super();
		this.name = name;
		this.productDesc = productDesc;
		this.adress = adress;
	}
	
	
}
