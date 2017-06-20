package srp;

public class Product {
	private String PriductID;
	private String productDesc;
	public String getPriductID() {
		return PriductID;
	}
	public void setPriductID(String priductID) {
		PriductID = priductID;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Product(String id,String desc) {
		PriductID=id;
		productDesc=desc;
	}
	@Override
	public boolean equals(Object obj) {
		Product p=(Product)obj;
		return p.PriductID==this.PriductID;
	}
	@Override
	public int hashCode() {
		return PriductID.hashCode();
	}
	
}
