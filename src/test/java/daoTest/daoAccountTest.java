package daoTest;

import com.alibaba.fastjson.JSON;
import com.restaurant.dao.AccountMapper;
import com.restaurant.dao.impl.AccountMapperImpl;
import com.restaurant.entity.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

public class daoAccountTest {

	@Test
	public void insert() {
		Account account = new Account("2019-02-06", "name", "sdfsadf 10", 10, 0);
		AccountMapper accountMapper = new AccountMapperImpl();
		accountMapper.insertAccount(account);
	}

	@Test
	public void testDelete() {
		int id = 1;
		AccountMapper accountMapper = new AccountMapperImpl();
		accountMapper.deleteAccount(1);
	}

	@Test
	public void testUpdate() {
		Account account = new Account(1, "2019-02-06", "name", "new ", 10, 0);
		AccountMapper accountMapper = new AccountMapperImpl();
		accountMapper.updateAccount(account);
	}

	@Test
	public void testAccountPaid() {
		AccountMapper accountMapper = new AccountMapperImpl();
		accountMapper.accountPaid(1);
	}

	@Test
	public void testGet() {
		String dateBegin = "2019-02-03";
		String dateEnd = "2019-02-08";
		AccountMapper accountMapper = new AccountMapperImpl();
		List<Account> accounts = accountMapper.selectAccountByDate(dateBegin, dateEnd, 0, 3);
		System.out.println(JSON.toJSONString(accounts));
	}

}
