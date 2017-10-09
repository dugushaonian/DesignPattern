package cn.edu.bjtu.dugufei.SimpleFactory;
/*
 * 简单工厂
 * 模拟客户端实现
 */
public class Test {
	public static void main(String[] args) {
		//工厂模式
//		HairInterface left = new LeftHair();
//		left.draw();
		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
//		HairInterface left = factory.getHairByClass("cn.edu.bjtu.dugufei.SimpleFactory.LeftHair");
//		left.draw();
		HairInterface hair = factory.getHairByKey("in");
		hair.draw();
	}
}
