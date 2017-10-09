package cn.edu.bjtu.dugufei.Factory;

/*
 * 模拟客户端实现
 */
public class Test {
	public static void main(String[] args) {
		//抽象工厂模式
		PerssonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drowGirl();
	}
}
