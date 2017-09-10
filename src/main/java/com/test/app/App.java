package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.test.*")
public class App {
	//http://127.0.0.1:8082/boot/girls/two
//	@Bean
//	public HttpMessageConverters converters() {
//		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//		FastJsonConfig config = new FastJsonConfig();
//		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		converter.setFastJsonConfig(config);
//		HttpMessageConverter<?> fastConverter = converter;
//		return new HttpMessageConverters(fastConverter);
//	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
