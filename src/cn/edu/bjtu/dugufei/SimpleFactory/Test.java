package cn.edu.bjtu.dugufei.SimpleFactory;
/*
 * �򵥹���
 * ģ��ͻ���ʵ��
 */
public class Test {
	public static void main(String[] args) {
		//����ģʽ
//		HairInterface left = new LeftHair();
//		left.draw();
		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
//		HairInterface left = factory.getHairByClass("cn.edu.bjtu.dugufei.SimpleFactory.LeftHair");
//		left.draw();
		HairInterface hair = factory.getHairByKey("in");
		hair.draw();
	}
}
