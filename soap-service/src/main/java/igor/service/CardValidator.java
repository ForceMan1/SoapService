package igor.service;

import javax.jws.WebService;

import igor.CreditCard;

@WebService(endpointInterface = "igor.service.Validator")
public class CardValidator implements Validator{
	public boolean validate(CreditCard creditCard) {
		Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() -1 );
		if(Integer.parseInt(lastDigit.toString()) % 2 == 0)
			return true;
		else 
			return false;
	}

}
