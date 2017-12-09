package azevedorafaela.cucumbermaven.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Support {
	
	public String baseUrl;
	public String user;
	public String pass;

	public void getProperties() throws IOException {
		Properties prop = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
		prop.load(inputStream);
		this.baseUrl = prop.getProperty("baseUrl");
		this.user = prop.getProperty("user");
		this.pass = prop.getProperty("password");
	}
}
