package srp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PromotionMail {
//	MailUtil.sendEmail(toAddress, fromAddress, subject, message, smtpHost, debug);
	private String fromAddress;
	private String subject;
	private String smtpHost;
	private boolean debug=false;
	public static void main(String[] args) throws Exception {
		PromotionMail pm = new PromotionMail();
		File f = new File("/Users/mac/Desktop/Github/coding2017/liuxin/ood/ood-assignment/src/main/java/com/coderising/ood/ocp/src/srp/product_promotion.txt");
		boolean emailDebug = false;
		pm.send(f);
	}
	public  void send(File file) throws Exception{
		GetConfiguration gf= new GetConfiguration();
		fromAddress=gf.getFromAddress();
		smtpHost=gf.getSmtpHost();
		List<Product> products=new ProductsFromFile().readFile(file);
		Map<String,User> users=new UserGetMsg(products).getMsg();
		Set<String> name =users.keySet();
		for (String string : name) {
			StringBuffer message=setMessage(string,users.get(string).getProductDesc());
			String toAddress=users.get(string).getAdress();
			sendEMails(toAddress,message);
		}
	}
	//可以放到一个Mail 对象 
	protected StringBuffer setMessage(String name,String pd) throws IOException 
	{
		subject="减价了";
		String[] productDesc =pd.split(",");
		StringBuffer sb= new StringBuffer("尊敬的 "+name+"  "+"您关注的产品 :");
		for (String string : productDesc) {
			sb.append(string+",");
		}
		return sb.append("降价了，欢迎购买!");
		
	}
	protected void sendEMails(String toAddress,StringBuffer message) throws IOException 
	{
		System.out.println("开始发送邮件");
		
		MailUtil.sendEmail(toAddress, fromAddress, subject, message, smtpHost, debug);
		
		System.out.println("发送邮件成功");
	}
}
