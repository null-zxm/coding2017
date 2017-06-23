package ocp;

public class Mail implements Sender{

	@Override
	public void send(String msg) {
		MailUtil.send(msg);
		
	}

}
