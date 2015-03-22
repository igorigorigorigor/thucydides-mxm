package mpro.widgets_test;

import java.io.FileReader;
import java.util.Properties;

public class BaseTest {

	private Properties props;
	
	
    public BaseTest() {
    	setProperties(loadProperties("application.properties"));
	}

	public String getProperty(String key)
    {
        return props.getProperty(key);
    }
    
    public void setProperties(Properties props)
    {
        this.props = props;
    }

    private static Properties loadProperties(String configFile)
    {
        Properties props = new Properties();
        try
        {
            props.load(new FileReader(configFile));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return props;
    }
}
