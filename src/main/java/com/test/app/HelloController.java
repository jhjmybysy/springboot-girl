package com.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // 等价于@Controller 和 @RequestBody
@RequestMapping("/say")
public class HelloController {
	
	@Autowired
	private GirProperties gp;
//	@Value("${girl.cupSize}")
//	private String cupSize;
//	
//	@Value("${girl.age}")
//	private Integer ages;
//	@Value("${girl.content}")
//	private String contenta;
	

	@RequestMapping(value = {"/hello","hi"}, method = RequestMethod.GET) // 建立请求映射 http://127.0.0.1:8080/hello
	public String hello() {
//		return "hello " + cupSize + " " + ages + content;
		return gp.getCupSize();
	}

	@RequestMapping("/hello3") // 建立请求映射 http://127.0.0.1:8080/hello
	public String hello3() {
		return "hello3" + 100/0;
	}
}
