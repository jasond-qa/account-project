package com.qa;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	AccountService ac1 = new AccountService();
	
	@Test
	public void testHashMap() {
		assertTrue(ac1.account.isEmpty());
	}
	
	@Test
	public void testAddAccount() {
		ac1.addAccount("first", "last");
		assertEquals(1, ac1.account.size());
	}
	
	@Test
	public void testRetrieveAccount() {
		ac1.addAccount("first", "last");
		assertEquals("first last, ID: 1", ac1.account.get(1).toString());
	}

}