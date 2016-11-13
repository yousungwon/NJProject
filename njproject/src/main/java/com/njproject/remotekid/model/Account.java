package com.njproject.remotekid.model;

import com.njproject.remotekid.controller.LoginController;

public class Account {
	public static final String TAG = Account.class.getCanonicalName();
	
	 private Long accountId; 
	 private String tel; 
	 private String passwd; 
	 private String name;
	 
	 
	 public Long getAccountId() { 
         return accountId; 
      } 
   
	 public void setAccountId(Long accountId) { 
         this.accountId = accountId; 
     }
}
