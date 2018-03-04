package netbee.springWeb.vienna.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class AccountInfo {

	private final String accountNo;
	
	private final String owner;
	
	private final long amt;
	
	private List<AccessHistory> historyList;
	
	public AccountInfo(String accNo, String owner, long amt) {
		this.accountNo= accNo;
		this.owner = owner;
		this.amt= amt;
	
		this.historyList = new ArrayList<AccessHistory>();
		AccessHistory h1 = new AccessHistory();
		
		AtomicLong counter = new AtomicLong();
		h1.setSeq(1);
		h1.setMoney(3040401);
		this.historyList.add(h1);
		h1.setSeq(2);
		h1.setMoney(339940401);
		this.historyList.add(h1);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public long getAmt() {
		return amt;
	}

	public List<AccessHistory> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(List<AccessHistory> historyList) {
		this.historyList = historyList;
	}
	
	
	
	
}
