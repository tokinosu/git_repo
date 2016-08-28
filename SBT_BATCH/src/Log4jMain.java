import org.apache.log4j.Logger;

public class Log4jMain {

	static protected Logger logger = Logger.getLogger( Log4jMain.class );

	public static void main(String[] args) {
//		Logger logger = Logger.getLogger(Log4j.class.getName());

		logger.trace("Hello trace");
		logger.debug("Hello debug");
		logger.info("Hello info");
		logger.warn("Hello warning");
		logger.error("Hello error");
		logger.fatal("Hello fatal");
	}

}
