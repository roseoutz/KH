package Utill_Package;

import java.util.*;
import static java.lang.System.out;

public class PropertiesEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Properties prop = new Properties();
	
	prop.put("UserName", "Micheal");
	prop.setProperty("lovely", "SunAe");
	prop.setProperty("dbDRV", "oracle.jdbc.driver.OracleDriver");
	
	String User = prop.getProperty("UserName");
	String love = prop.getProperty("lovely");
	String db_drv = prop.getProperty("dbDRV");
	out.println(User);
	out.println(love);
	out.println(db_drv);
	
	out.println("Keys");
	
	Enumeration keys = prop.propertyNames();
	while(keys.hasMoreElements())
		out.println(keys.nextElement());
	
	prop.list(System.out);
	}

}
