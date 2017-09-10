package com.test.app;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

	@Autowired
	private GirlRepository girlRepository;

	@Autowired
	private GirlService girlService;

	@GetMapping("/girls")
	public List<Girl> girlList() {
		return girlRepository.findAll();
	}

	// @PostMapping("/girls")
	// public Girl girlAdd(@RequestParam("cupSize") String cupSize,
	// @RequestParam("age") Integer age) {
	// Girl girl = new Girl();
	// girl.setAge(age);
	// girl.setCupSize(cupSize);
	// return girlRepository.save(girl);
	// }

	@PostMapping("/girls")
	public Result<Girl> girlAdd(@Valid Girl g, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
		}
		Girl girl = new Girl();
		girl.setAge(g.getAge());
		girl.setCupSize(g.getCupSize());

		return ResultUtil.success(girlRepository.save(girl));
	}

	@GetMapping(value = "/girls/{id}")
	public Girl girlFindOne(@PathVariable("id") Integer id) {
		return girlRepository.findOne(id);
	}

	@PutMapping(value = "/girls/{id}")
	public Girl girlUpdate(@PathVariable("id") Integer id, @RequestParam("cupSize") String cupSize,
			@RequestParam("age") Integer age) {
		Girl girl = new Girl();
		girl.setId(id);
		girl.setAge(age);
		girl.setCupSize(cupSize);
		return girlRepository.save(girl);

	}

	@DeleteMapping(value = "/girls/{id}")
	public void girlDelete(@PathVariable("id") Integer id) {
		girlRepository.delete(id);
	}

	@GetMapping(value = "/girls/age/{age}")
	public List<Girl> girlListbByAge(@PathVariable("age") Integer age) {
		return girlRepository.findByAge(age);
	}

	@PostMapping(value = "/girls/two")
	public void girlTwo() {
		girlService.insertTwo();
	}
	
    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }
}
