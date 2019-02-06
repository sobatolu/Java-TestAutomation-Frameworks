package com.interswitchgroup.V3P.Utilities;

import java.io.IOException;
import java.util.Properties;

public class Utilities {
	
	public static final String DEFAULT_PROPERTIES = "system.properties";
	private static Properties prod;
	
	
	 /**
	   * @return load the file system.properties
	   */
	  public static Properties getProperties() {
	      if (prod == null) {
	          prod = new Properties();
	          try {
	              prod.load(Utilities.class.getClassLoader().getResourceAsStream(DEFAULT_PROPERTIES));
	          } catch (IOException e) {               
	              Log.error("property file failed to load " + e.getMessage());
	          }
	      }
	      return prod;
	  }
	  
	  /**
	   * @param key
	   * @return get value of key
	   */
	  public static String getKey(String key) {
	      Object obj = getProperties().get(key);
	      String value = "";
	      if (obj != null) 
	          value = obj.toString();
	      return value;
	  }

}
