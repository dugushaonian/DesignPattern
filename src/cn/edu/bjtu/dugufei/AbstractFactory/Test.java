package cn.edu.bjtu.dugufei.AbstractFactory;
/*
 * ģ��ͻ���ʵ��
 */
public class Test {
	public static void main(String[] args) {
		//���󹤳�ģʽ
		PerssonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drowGirl();
//		PerssonFactory factory = new HNFactory();
//		Boy boy = factory.getBoy();
//		boy.dorwBoy();
		 
	}
}
