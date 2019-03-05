package com.springboot.autolayout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//当前类是一个配置类（相当于将当前类作为一个spring容器）
@EnableConfigurationProperties(PersonProperties.class)//相当于把PersonProperties类配置到当前容器中（PersonProperties类上没有@Component）
public class PersonAutoConfiguration {

	@Autowired
	private PersonProperties personProperties;
	
	@Bean
	public HelloPersonBean helloPersonBean() {
		HelloPersonBean helloPersonBean = new HelloPersonBean();
		helloPersonBean.setMsg(personProperties.getName());
		return helloPersonBean;
	}
}
