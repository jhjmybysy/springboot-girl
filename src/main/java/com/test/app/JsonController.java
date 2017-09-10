package com.test.app;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 等价于@Controller 和 @RequestBody
@RequestMapping("/demo")
public class JsonController {

	@RequestMapping("/getDemo") // 建立请求映射 http://127.0.0.1:8080/demo/getDemo
	public JsonDemo demo() {
		JsonDemo demo = new JsonDemo();
		demo.setId(1);
		demo.setName("Angel");
		demo.setCreateTime(new Date());
		return demo;
	}

}
