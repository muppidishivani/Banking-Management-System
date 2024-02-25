package com.web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.model.BankAccount;
import com.web.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {
	@Autowired
	private BankRepo repo;
	

	@Override
	public BankAccount addAccount(BankAccount bank) {
		
		return repo.save(bank);
	}

	@Override
	public BankAccount getBalance(Long accountno, String password) {
		BankAccount b=repo.findByAccountnoAndPassword(accountno, password);
		return b;
	}

	@Override
	public boolean deposit(Long accountno, String password, double deposit) {
		BankAccount bank=repo.findByAccountno(accountno);
		if(bank!=null && bank.getPassword().equals(password)) {
			double currentamt=bank.getAmount();
			double total=currentamt+deposit;
			bank.setAmount(total);
			repo.save(bank);
			return true;
		}
		return false;
	}

	@Override
	public boolean withDraw(Long accountno, String password, double withdrawAmount) {
		BankAccount bank=repo.findByAccountno(accountno);
		if(bank!=null && bank.getPassword().equals(password) ) {
			double currentbalance=bank.getAmount();
			
			double totalbalance;
			if(currentbalance >= withdrawAmount) {
				totalbalance=currentbalance-withdrawAmount;
				bank.setAmount(totalbalance);
				repo.save(bank);
				return true;
			}
			else {
				return false;
			}
			
		}
		return false;
	}

	@Override
	public boolean transfer(Long accountno, Long targetAccountno, String password, double amount) {
		BankAccount bank1=repo.findByAccountno(accountno);
		BankAccount bank2=repo.findByAccountno(targetAccountno);
		
		if((bank1!=null && bank2!=null) && (bank1.getPassword().equals(password))) {
			double currentbalance=bank1.getAmount();
			double targestaccountcurrentamt=bank2.getAmount();
			
			double afterTrasfer=currentbalance-amount;
			double targetAccountAmount=targestaccountcurrentamt+amount;
			
			bank1.setAmount(afterTrasfer);
			bank2.setAmount(targetAccountAmount);
			
			repo.save(bank1);
			repo.save(bank2);
			return true;
			
		}
		return false;
	}

	
	
}

	
		




	

	


	

	



