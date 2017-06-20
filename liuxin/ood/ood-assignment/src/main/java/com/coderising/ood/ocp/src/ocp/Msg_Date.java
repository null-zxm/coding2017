package ocp;

public class Msg_Date implements Type {


	public String MsgType(String msg) {
		msg=msg+DateUtil.getCurrentDateAsString();
		return msg;
	}

}
