package com.test.spring_boot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 等价于@Controller 和 @RequestBody
public class HelloController {

	@RequestMapping("/hello1") // 建立请求映射 http://127.0.0.1:8080/hello
	public String hello() {
		return "hello";
	}

	@RequestMapping("/hello3") // 建立请求映射 http://127.0.0.1:8080/hello
	public String hello3() {
		return "hello3" + 100/0;
	}
}
