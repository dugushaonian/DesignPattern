package cn.edu.bjtu.dugufei.Factory;
/*
 * 圣诞系列工厂
 */
public class MCFactory implements PerssonFactory {

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
