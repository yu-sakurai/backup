package com.human;

public class Human {
	public static String sei;
	public static String mei;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("HelloWorld");
		/*sei="sakurai";
		mei="sakurai";*/
		
		
		HumanName sakurai=new HumanName();
		sakurai.sei="sakurai";
		sakurai.setMei("jdkdld");
		System.out.println(sakurai.sei+sakurai.getMei());
		
		HumanName Human=new HumanName();
		String sei=Human.sei;
		String mei=Human.getMei();
		System.out.println(sei+mei);
		
		
		HumanName tanaka=new HumanName("sakuradtyfi","sakurai");
		System.out.println(tanaka.sei+tanaka.getMei());
		
	}
}
