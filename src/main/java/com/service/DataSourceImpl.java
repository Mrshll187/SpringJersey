package com.service;

import org.springframework.stereotype.Repository;

@Repository
public class DataSourceImpl implements DataSource {

	@Override
	public String load() {
		return "Hello";
	}
}
