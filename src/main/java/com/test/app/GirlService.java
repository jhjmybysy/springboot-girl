package com.test.app;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

	@Autowired
	private GirlRepository girlRepository;

	@Transactional
	public void insertTwo() {
		Girl a = new Girl();
		a.setCupSize("A");
		a.setAge(44);
		girlRepository.save(a);

		System.out.print(1 / 0);

		Girl b = new Girl();
		a.setCupSize("B");
		a.setAge(44);
		girlRepository.save(b);

		System.out.print(1 / 1);

	}

	public void getAge(Integer id) throws Exception {
		Girl girl = girlRepository.findOne(id);
		Integer age = girl.getAge();
		if (age < 10) {
			// 返回"你还在上小学吧" code=100
			throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
		} else if (age > 10 && age < 16) {
			// 返回"你可能在上初中" code=101
			throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
		}

		// 如果>16岁,加钱
		// ...
	}

	/**
	 * 通过Id查询一个女生的信息
	 * 
	 * @param id
	 * @return
	 */
	public Girl findOne(Integer id) {
		return girlRepository.findOne(id);
	}
}
