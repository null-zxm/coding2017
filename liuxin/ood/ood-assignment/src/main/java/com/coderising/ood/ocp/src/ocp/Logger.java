package ocp;

public class Logger {
	Type type ;
	Method method;
	public Logger(Type type, Method method){
		this.type = type;
		this.method = method;		
	}
	public void log(String msg){
		method.send(type.MsgType(msg));
	}
}

