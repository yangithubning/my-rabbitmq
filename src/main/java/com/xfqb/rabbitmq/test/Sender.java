package com.xfqb.rabbitmq.test;

import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 直接发送到queue中
 * 
 * @author ning yan
 * 
 * @Date 2019年1月7日 上午10:48:50
 * 
 */
@RestController
public class Sender {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@GetMapping(value = "/send")
	public void send() {
		for (int i = 0; i < 100; i++) {
			String context = "hello " + new Date();
			this.rabbitTemplate.convertAndSend("hello", context);
		}

		System.out.println("发送成功");
	}
}
