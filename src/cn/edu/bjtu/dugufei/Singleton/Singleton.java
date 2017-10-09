package cn.edu.bjtu.dugufei.Singleton;


/*
 * 单例模式
 * 作用：保证整个应用程序只能有一个实例
 * 饿汉式，懒汉式
 */
public class Singleton {
	//饿汉式
	//1.构造方法私有化，外部不能实例化
	private Singleton(){
		
	}
	//2.创建类唯一实例,private static
	private static Singleton instance = new Singleton();
	//3.提供一个获取实例的方法,public static
	public static Singleton getInstance() {
		return instance;
	}
}
