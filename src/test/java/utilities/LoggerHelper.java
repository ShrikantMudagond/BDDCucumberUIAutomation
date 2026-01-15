package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
    public static Logger getLogger() {
        Logger logger = Logger.getLogger("BDDLogger");
        PropertyConfigurator.configure("src/test/resources/log4j.properties");
        return logger;
    }
}
