package cn.edu.bjtu.dugufei.SimpleFactory;

import java.util.Map;

/*
 * 发型工厂
 */
public class HairFactory {
	public HairInterface getHair(String key){
		if("left".equals(key)){
			return new LeftHair();
		}
		else if ("right".equals(key)) {
			return new RightHair();
		}
		else {
			return null;
		}
	}
	/**
	 * 根据类名来生产对象
	 * @param className
	 * @return
	 */
	public HairInterface getHairByClass(String className) {
		try {
			HairInterface hairInterface = (HairInterface) Class.forName(className).newInstance();
			return hairInterface;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * 根据key
	 */
	public HairInterface getHairByKey(String key) {
		try {
			Map<String,String> map=new PropertiesReader().getProperties();
			HairInterface hairInterface = (HairInterface) Class.forName(map.get(key)).newInstance();
			return hairInterface;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
