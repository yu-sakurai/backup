
public class Test {

	public static void main(String[] args) {
		Person taro=new Person();
		taro.name="yamada taro";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person hanako=new Person();
		hanako.name="kimura hanako";
		hanako.age=18;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		Person jiro=new Person();
		jiro.name="suzuki jiro";
		jiro.age=29;
		jiro.phone="0190-29859";
		jiro.address="sfadfagagr";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phone);
		System.out.println(jiro.address);
		
		taro.talk();
		
	}

}
