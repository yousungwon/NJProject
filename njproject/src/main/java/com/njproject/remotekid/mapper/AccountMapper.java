package com.njproject.remotekid.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import com.njproject.remotekid.model.Account;


@Mapper
public interface AccountMapper {
	public static final String TAG = AccountMapper.class.getCanonicalName();
	
	@Select("select account.account_id as accountId, account.* from account where tel = #{tel}")
	Account selectAccount(@Param(value="tel") String tel);
	
	@Select("select a.account_id from account a")
	Account setAccount();
	
	@Select("select a.account_id from account a ")
	void testSelect();
	
	
		
	
	
}
