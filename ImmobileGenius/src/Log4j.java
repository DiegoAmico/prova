import org.apache.log4j.Logger;



public class Log4j {

	
	
	
		public  void runLog4j(){
		
	final Logger logger=Logger.getLogger(Log4j.class);
			
			
			logger.debug("this is debug :");
	        logger.info("This is info :");
	        logger.warn("This is warn :" );
	        logger.error("This is error :");
	        logger.fatal("This is fatal :");
		}

	}


