package cn.edu.bjtu.dugufei.Factory;
/*
 * ʥ��ϵ�й���
 */
public class MCFactory implements PerssonFactory {

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
