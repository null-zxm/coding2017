package ocp;

public class Msg_Date implements Content {


	public String MsgType(String msg) {
		msg=msg+DateUtil.getCurrentDateAsString();
		return msg;
	}

}
