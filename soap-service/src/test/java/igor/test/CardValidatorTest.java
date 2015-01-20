package igor.test;

import static org.junit.Assert.*;
import igor.CreditCard;
import igor.service.CardValidator;

import org.junit.Test;

public class CardValidatorTest {
	@Test
	public void shouldCheckCreditCardValidity(){
		CardValidator cardValidator = new CardValidator();
		CreditCard creditCard = new CreditCard("12341234", "10/10", 1234, "VISA");
		assertTrue("Credit card should be valid", cardValidator.validate(creditCard));
		creditCard.setNumber("12341233");
		assertFalse("CreditCard should not be valid", cardValidator.validate(creditCard));
	}
}
