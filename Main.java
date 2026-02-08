/**
 * Program description.
 * Isaac Romo
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions, birthMonth;
		char sex;
		
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear,
				expireDay, expireMonth, expireYear;

		//INPUT SECTION
		surname = "ROMO";
		givenName = "ISAAC";
		category = "CO9";
		cardNum = "123456789";
		birthCountry = "UNITED STATES OF AMERICA";
		termsAndConditions = "NONE";
		sex = 'M';
		birthMonth = "JUL";
		uscisNum1 = 123;
		uscisNum2 = 456;
		uscisNum3 = 789;
		birthDay = 31;
		birthYear = 2000;
		validDay = 31;
		validMonth = 7;
		validYear = 2026;
		expireDay = 31;
		expireMonth = 7;
		expireYear = 2034;

		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + uscisNum1 + " - " + uscisNum2 + " - " + uscisNum3 + "    " + category + "        " + cardNum + "");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsAndConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + birthDay + "/" + birthMonth + "/" + birthYear + "     " + sex + "");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + "");
		System.out.println("║                       Card Expires:   " + expireMonth + "/" + expireDay + "/" + expireYear + " ");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
