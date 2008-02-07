package esb.chapter4.component;

import org.apache.log4j.Logger;

public class SimpleComponent {
	
	private final static Logger logger = Logger.getLogger(SimpleComponent.class);
	
	public String accept(String payload) {
		String message = "received payload " + payload;
		logger.info(message);
		return message;
	}
}
