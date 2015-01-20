package igor.service;

import javax.jws.WebService;

import igor.CreditCard;

@WebService
public interface Validator {
	public boolean validate(CreditCard creditCard);
}
