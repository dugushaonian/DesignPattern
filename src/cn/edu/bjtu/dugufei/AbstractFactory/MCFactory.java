package cn.edu.bjtu.dugufei.AbstractFactory;
/*
 * ʥ��ϵ�й���
 */
public class MCFactory implements PerssonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
