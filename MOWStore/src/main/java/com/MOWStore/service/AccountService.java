package com.MOWStore.service;

import java.util.List;

import com.MOWStore.entity.Account;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
