package cn.edu.bjtu.dugufei.AbstractFactory;
/*
 * 模拟客户端实现
 */
public class Test {
	public static void main(String[] args) {
		//抽象工厂模式
		PerssonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drowGirl();
//		PerssonFactory factory = new HNFactory();
//		Boy boy = factory.getBoy();
//		boy.dorwBoy();
		 
	}
}
