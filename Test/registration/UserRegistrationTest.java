package registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user = null;

    @Before
    public void setUp() {
        user = new UserRegistration();
    }

    @Test
    public void firstNameTest_should_giveTrueWhenNameIsValid() {
        boolean result = user.validateFirstName("Afren");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameTest_should_giveFalseWhenName_doesnotStartWithUpperCase() {
        boolean result = user.validateFirstName("afreen");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameTest_should_giveTrueWhenName_containsMinimumThreeCharacters() {
        boolean result = user.validateFirstName("Afr");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameTest_should_giveFalse_whenAllCharactersOfNameInUpperCase() {
        boolean result = user.validateFirstName("FATHIMA");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameTest_should_giveFalse_whenAllCharactersOfNameInLowerCase() {
        boolean result = user.validateFirstName("afreen");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTest_should_giveTrueWhenNameIsValid() {
        boolean result = user.validateLastName("fathima");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameTest_should_giveFalseWhenName_doesnotStartWithUpperCase() {
        boolean result = user.validateLastName("afreen");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTest_should_giveTrueWhenName_containsMinimumThreeCharacters() {
        boolean result = user.validateLastName("afr");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameTest_should_giveFalse_whenAllCharactersOfNameInUpperCase() {
        boolean result = user.validateLastName("AFREEN");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTest_should_giveFalse_whenAllCharactersOfNameInLowerCase() {
        boolean result = user.validateLastName("fathima");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberTest_should_giveTrue_whenMobileeNumberIsValid() {
        boolean result = user.validateMobileNo("91 987654321");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumberTest_should_giveFalse_whenMobileeNumberIsInValid() {
        boolean result = user.validateMobileNo("987654321");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberTest_should_giveFalse_whenNoSpaceBetween_mobileeNumberAndCountryCode() {
        boolean result = user.validateMobileNo("987654321");
        Assert.assertFalse(result);
    }

    @Test
    public void passwordTest_should_giveTrue_whenPasswordIsValid() {
        boolean result = user.validatePassword("oneFine$Day123");
        Assert.assertTrue(result);
    }

    @Test
    public void passwordTest_should_giveFalse_whenPasswordIsInValid() {
        boolean result = user.validatePassword("oneFine$Day");
        Assert.assertFalse(result);
    }

    @Test
    public void emailIdTest_should_giveTrue_whenEmailIdIsValid() {
        boolean result = user.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void emailIdTest_should_giveFalse_whenEmailIdIsInValid() {
        boolean result = user.validateEmail("abc@@bl.in");
        Assert.assertFalse(result);
    }
}