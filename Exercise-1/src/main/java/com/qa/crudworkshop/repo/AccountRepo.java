package com.qa.crudworkshop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.qa.crudworkshop.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> //MUST be the same as ID type -> <Object, Identifier (ID in this case)>
{
	@Query("select acc from Account acc where acc.name =?1") //Java Persistence Query Language -> treated like a class rather than table
	List<Account> findAccountByName(String name);
	
	@Query("select acc from Account acc where acc.accountNumber =?1")
	List<Account> findAccountByAccountNumber(String acc);
	
	@Query("select acc from Account acc where acc.name =?1")
	List<Account> findAccountById(long id);
}
