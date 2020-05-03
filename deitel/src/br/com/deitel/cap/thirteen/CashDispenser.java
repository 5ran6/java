package br.com.deitel.cap.thirteen;

public class CashDispenser {
	private final static int INITIAL_COUNT = 500;
	private int count;

	public CashDispenser() {
		count = INITIAL_COUNT;
	}

	public void dispenseCash(int amount) {
		int billsRequired = amount / 20;
		count -= billsRequired;
	}

	public boolean isSufficienteCashAvailable(int amount) {
		int billsRequired = amount / 20;

		if (count >= billsRequired) {
			return true;
		} else {
			return false;
		}
	}
}
