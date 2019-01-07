package com.xfqb.rabbitmq.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description 描述
 * 
 * @author ning yan
 * 
 * @Date 2019年1月7日 上午11:03:38
 * 
 */
@Component
@RabbitListener(queues = "hello")
public class WorldReceiver {
	@RabbitHandler
	public void process(String hello) {
		System.out.println("world Receiver  : " + hello);
	}
}
