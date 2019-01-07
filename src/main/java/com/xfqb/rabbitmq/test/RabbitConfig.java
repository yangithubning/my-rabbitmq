package com.xfqb.rabbitmq.test;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 描述
 * 
 * @author ning yan
 * 
 * @Date 2019年1月7日 上午10:47:34
 * 
 */
@Configuration
public class RabbitConfig {

	@Bean
	public Queue queue() {
		return new Queue("hello");
	}
}
