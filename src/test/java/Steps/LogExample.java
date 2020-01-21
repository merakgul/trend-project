package Steps;

import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class LogExample {
    public static void main(String[] args) throws SecurityException, IOException {
        String log4jConfigFile = System.getProperty("user.dir")
                + File.separator + "log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
        LOGGER.info("Logger Name: " + LOGGER.getName());
        LOGGER.warning("this is a warning log message");
    }

}
