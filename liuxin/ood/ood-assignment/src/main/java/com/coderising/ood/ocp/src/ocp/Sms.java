package ocp;

public class Sms implements Method {

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		SMSUtil.send(msg);
	}

}
