package com.qa.crudworkshop.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.qa.crudworkshop.model.Account;
import com.qa.crudworkshop.service.AccountService;

@RestController
public class AccountController
{
	private AccountService accService;

	public AccountController(AccountService accService)
	{
		super();
		this.accService = accService;
	}
	
//	------------------Postman------------------
	@PostMapping("/create") // POST
	public Account create(@RequestBody Account acc)
	{
		return this.accService.addAccount(acc);
	}
	@PutMapping("/update/{id}") // PUT
	public Account updateAccount(@PathVariable("name") long id,@RequestBody Account acc)
	{
		return this.accService.updateAccount(id, acc);
	}
	@DeleteMapping("/delete/{id}") // DELETE
	public void deleteAccount(@PathVariable long id)
	{
		this.accService.deleteAccount(id);
	}
	@GetMapping("/readall") // GET ALL
	public List<Account> readAll()
	{
		return this.accService.readAccount();
	}
	@GetMapping("/readname") // GET NAME
	public List<Account> getName(@PathVariable String name)
	{
		return this.accService.findAccountByName(name);
	}
	@GetMapping("/readid") // GET ID
	public List<Account> getId(@PathVariable long id)
	{
		return this.accService.findAccountById(id);
	}
	@GetMapping("/readaccountnumber") // GET ACC #
	public List<Account> getAccountNumber(@PathVariable String acc)
	{
		return this.accService.findAccountByAccountNumber(acc);
	}
}
