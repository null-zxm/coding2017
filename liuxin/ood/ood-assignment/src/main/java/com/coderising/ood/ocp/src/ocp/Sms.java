package ocp;

public class Sms implements Sender {

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		SMSUtil.send(msg);
	}

}
