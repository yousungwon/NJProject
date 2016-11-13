package com.njproject.remotekid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njproject.remotekid.mapper.AccountMapper;
import com.njproject.remotekid.model.Account;


@Service
public class AccountService {
	public static final String TAG = AccountService.class.getCanonicalName();
	
	@Autowired
	AccountMapper accountMapper;
	
	public Account selectAccount(String tel) {
		return accountMapper.selectAccount(tel);
	}
	
	
	
}
