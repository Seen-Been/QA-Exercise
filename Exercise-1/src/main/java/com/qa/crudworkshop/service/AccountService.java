package com.qa.crudworkshop.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.qa.crudworkshop.model.Account;
import com.qa.crudworkshop.repo.AccountRepo;

@Service
public class AccountService
{
	private AccountRepo repo;
	
	public AccountService(AccountRepo repo) //constructor for repository. shortens CRUD method length.
	{
		super();
		this.repo = repo;
	}
	
//	------------------CRUD------------------
	public Account addAccount(Account acc)
	{
		return this.repo.save(acc);
	}
	
	public List<Account> readAccount()
	{
		return this.repo.findAll();
	}
	
	public Account updateAccount(long id, Account acc)
	{
		Optional<Account> tempAcc = this.repo.findById(id);
		Account existing = tempAcc.get();
		//*primary key should not be changed*
		existing.setName(acc.getName()); //LomBok used. Program still runs despite these
		existing.setAccountNumber(acc.getAccountNumber());
		return this.repo.save(existing);
	}
	
	public boolean deleteAccount(long id)
	{
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
//	------------------Queries------------------
	public List<Account> findAccountByName (String name)
	{
		return this.repo.findAccountByName(name);
	}
	public List<Account> findAccountById (long id)
	{
		return this.repo.findAccountById(id);
	}
	public List<Account> findAccountByAccountNumber (String acc)
	{
		return this.repo.findAccountByAccountNumber(acc);
	}
}
