package com.human;

public class HumanName {
	public String sei;
	private String mei;
	
	
	public HumanName(){
		sei=null;
		mei=null;
	}
	
	
	public HumanName(String sei,String mei){
		this.sei=sei;
		this.mei=mei;
	}
	
	public String getMei(){
		return mei;
	}
	public void setMei(String mei){
		this.mei=mei;
	}
/*	
 * 
	public static void main(String[] args){
		
		mei="sakurai";
		System.out.println(mei);
	}*/

}
