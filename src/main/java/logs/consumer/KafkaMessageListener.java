package logs.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

	Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

	@KafkaListener(topics = "simon-topic-1", groupId = "simon-group-1")
	public void consume(String message) {
		logger.info("consumer consume the message {} ", message);

	}

	@KafkaListener(topics = "mis-exception", groupId = "simon-group-1")
	public void consumeException(String message) {
		logger.info("Exception: {} ", message);

	}
	
	@KafkaListener(topics = "mis-default-exception", groupId = "simon-group-1")
	public void consumeDefaultException(String message) {
		logger.info("Exception: {} ", message);

	}

}
