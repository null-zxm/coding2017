package com.coderising.jvm.constant;

public class NullConstantInfo extends ConstantInfo {

	public NullConstantInfo(){
		
	}
	@Override
	public int getType() {		
		return -1;
	}
	@Override
	public void accept(Visitor visitor) {
				
	}
	
}
