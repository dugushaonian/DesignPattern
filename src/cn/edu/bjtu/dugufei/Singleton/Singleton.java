package cn.edu.bjtu.dugufei.Singleton;


/*
 * ����ģʽ
 * ���ã���֤����Ӧ�ó���ֻ����һ��ʵ��
 * ����ʽ������ʽ
 */
public class Singleton {
	//����ʽ
	//1.���췽��˽�л����ⲿ����ʵ����
	private Singleton(){
		
	}
	//2.������Ψһʵ��,private static
	private static Singleton instance = new Singleton();
	//3.�ṩһ����ȡʵ���ķ���,public static
	public static Singleton getInstance() {
		return instance;
	}
}
