package com.xfqb.rabbitmq.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description 描述
 * 
 * @author ning yan
 * 
 * @Date 2019年1月7日 上午10:50:58
 * 
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

	@RabbitHandler
	public void process(String hello) {
		System.out.println("hello Receiver  : " + hello);
	}

}
