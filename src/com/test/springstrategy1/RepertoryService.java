package com.test.springstrategy1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class RepertoryService {

	@Autowired
	private RepertoryDao repertoryDao;
	
	public List<?> getSomeFruits(int type) {
		switch (type) {
		case 0:	
			return repertoryDao.getSomeApples();
		default:
			break;
		}
		return null;
	}
}
