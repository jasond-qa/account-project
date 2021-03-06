package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.AccountService;

@Path("/account")
public class AccountEndpoint {
	
	@Inject
	private AccountService service;

	@Path("/retrieveAccounts/")
	@GET
	@Produces({ "application/json" })
	public String retrieveAccounts(@PathParam("accNo") int accNo) {
//		return service.retrieveAccounts(accNo);
		return null;
	}

	@Path("/addAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
//		return service.addAccount(account);
		return null;
	}
	

	public void setService(AccountService service) {
		this.service = service;
	}

}
