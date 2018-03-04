package netbee.springWeb.vienna.amqp.rpc;


import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Gary Russell
 * @author Scott Deeg
 */
public class Tut6Client {

	@Autowired
	private RabbitTemplate amqpTemplate;

	@Autowired
	private DirectExchange exchange;

	int start = 0;

	@Scheduled(fixedDelay = 100, initialDelay = 50)
	public void send(RabbitTemplate template) {
		System.out.println(" [x] Requesting fib(" + start + ")");

		Integer response = (Integer) template.convertSendAndReceive("tut.rpc", "rpc", start++);
		System.out.println(" [.] Got '" + response + "'");
	}

}
