package cn.edu.bjtu.dugufei.Factory;

public class HNFactory implements PerssonFactory {
	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new HNGirl();
	}

}
