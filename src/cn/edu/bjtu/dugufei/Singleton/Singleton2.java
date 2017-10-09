package cn.edu.bjtu.dugufei.Singleton;
/*
 * 懒汉式
 * 区别：饿汉式，线程安全
 * 		懒汉式，线程不安全
 */
public class Singleton2 {
	//1.构造方法私有化
	private Singleton2(){}
	//2.声明实例
	private static Singleton2 instance;
	//3.获取实例方法
	public static Singleton2 getInstance(){
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
