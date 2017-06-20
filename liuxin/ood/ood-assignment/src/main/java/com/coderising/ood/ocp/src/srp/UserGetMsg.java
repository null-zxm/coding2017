package srp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserGetMsg {
	public UserGetMsg(List<Product> products) {
		super();
		this.products = products;
	}
	List<Product> products;
	Map<String,User> users=new LinkedHashMap<>();
	private List<Map<String,String>> loadMailingList(Product p) throws Exception {
		
		String sendMailQuery = "Select name from subscriptions "
				+ "where product_id= '" + p.getPriductID() +"' "
				+ "and send_mail=1 ";
		return DBUtil.query(sendMailQuery);
	}
	public Map<String,User> getMsg() throws Exception{
		for (Product product : products) {
			List<Map<String,String>> map=loadMailingList(product);
			for (Map<String, String> map2 : map) {
				String string =map2.get("name");
					if(users.containsKey(string)){
						String sb=users.get(string).getProductDesc();
						User u=users.get(string);
						u.setProductDesc(u.getProductDesc()+","+product.getProductDesc());
						users.put(string, u );
					}else{
						users.put(string,new User(string,product.getProductDesc(),map2.get("email")));
					}
				
			}
			
		}
		return users;
	}
}
