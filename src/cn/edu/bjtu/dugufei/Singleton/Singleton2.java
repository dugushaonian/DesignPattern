package cn.edu.bjtu.dugufei.Singleton;
/*
 * ����ʽ
 * ���𣺶���ʽ���̰߳�ȫ
 * 		����ʽ���̲߳���ȫ
 */
public class Singleton2 {
	//1.���췽��˽�л�
	private Singleton2(){}
	//2.����ʵ��
	private static Singleton2 instance;
	//3.��ȡʵ������
	public static Singleton2 getInstance(){
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
