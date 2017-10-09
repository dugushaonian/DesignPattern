package cn.edu.bjtu.dugufei.AbstractFactory;
/*
 * 人物接口
 */
public interface PerssonFactory {
	//男孩接口
	public Boy getBoy();
	//女孩接口
	public Girl getGirl();
}
