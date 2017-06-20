package ocp;

public class Mail implements Method{

	@Override
	public void send(String msg) {
		MailUtil.send(msg);
		
	}

}
