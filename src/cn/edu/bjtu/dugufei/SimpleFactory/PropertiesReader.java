package cn.edu.bjtu.dugufei.SimpleFactory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
 * properties�ļ��Ķ�ȡ��
 */
public class PropertiesReader {
	public Map<String, String> getProperties() {
		Properties props = new Properties();
		Map<String, String> map = new HashMap<String,String>();
		try {
			InputStream in = getClass().getResourceAsStream("type.properties");
			props.load(in);
			Enumeration<?> en = props.propertyNames();
			while(en.hasMoreElements()){
				String key = (String) en.nextElement();
				String property = props.getProperty(key);
				map.put(key, property);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return map;
	}
}