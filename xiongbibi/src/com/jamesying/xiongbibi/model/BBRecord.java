package com.jamesying.xiongbibi.model;

public class BBRecord {
	private static final int SHORTCONTENTLENGTH = 20;
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getShortContent(){
		if (content.length() > SHORTCONTENTLENGTH){
			return content.substring(0, SHORTCONTENTLENGTH);
		}
		
		return content;
	}
}
