package com.MOWStore.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MOWStore.entity.Account;
import com.MOWStore.repository.AccountRepository;
import com.MOWStore.service.AccountService;

@Service
public class AccountServiceImplement implements AccountService{
	@Autowired
	AccountRepository accountDAO;
	
	@Override
	public Account findById(String username) {
		Account account = accountDAO.findById(username).get();
		return account;
	}

	@Override
	public List<Account> getAdministrators() {
		return accountDAO.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return accountDAO.findAll();
	}
}
