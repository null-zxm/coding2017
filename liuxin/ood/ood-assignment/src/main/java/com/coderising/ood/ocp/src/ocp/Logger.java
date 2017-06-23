package ocp;

public class Logger {
	Content contant ;
	Sender senter;
	public Logger(Content contant, Sender senter){
		this.contant = contant;
		this.senter = senter;		
	}
	public void log(String msg){
		senter.send(contant.MsgType(msg));
	}
}

