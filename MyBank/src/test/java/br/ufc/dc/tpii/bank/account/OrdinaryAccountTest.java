package br.ufc.dc.tpii.bank.account;

import br.ufc.dc.tpii.bank.account.OrdinaryAccount;
import br.ufc.dc.tpii.bank.account.exception.InsufficientFundsException;
import br.ufc.dc.tpii.bank.account.exception.NegativeAmountException;
import br.ufc.dc.tpii.bank.test.account.Before;
import br.ufc.dc.tpii.bank.test.account.Test;
import junit.framework.TestCase;

public class OrdinaryAccountTest extends TestCase {

	private OrdinaryAccount account;
	
		
	@Before
	public void setUp() throws Exception {
		account = new OrdinaryAccount("123A");
	}
	
	@Test
	public void testCredit50AndDebit30(){
		try {
			account.credit(50);
			assertEquals("Erro na op", 50, account.getBalance(), 0.0);
			account.debit(30);
			assertEquals("Erro na op", 20, account.getBalance(), 0.0);
		} catch (NegativeAmountException e) {
			fail(e.getMessage());
		} catch (InsufficientFundsException e) {
			fail(e.getMessage());
		}
	}

	public void testDebit() {
		fail("Not yet implemented");
	}

	public void testOrdinaryAccount() {
		fail("Not yet implemented");
	}

	public void testAbstractAccount() {
		fail("Not yet implemented");
	}

	public void testCredit() {
		fail("Not yet implemented");
	}

	public void testGetNumber() {
		fail("Not yet implemented");
	}

	public void testGetBalance() {
		fail("Not yet implemented");
	}

}
