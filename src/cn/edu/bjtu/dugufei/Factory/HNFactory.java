package cn.edu.bjtu.dugufei.Factory;
/*
 * 元旦系列工厂
 */
public class HNFactory implements PerssonFactory {
	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new HNGirl();
	}

}
