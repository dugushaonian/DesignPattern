package cn.edu.bjtu.dugufei.Factory;

/*
 * ģ��ͻ���ʵ��
 */
public class Test {
	public static void main(String[] args) {
		//���󹤳�ģʽ
		PerssonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drowGirl();
	}
}
