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
    public void firstNameTest_should_giveTrueWhenNameIsValid() throws ValidationException {
        boolean result = user.validateFirstName("Afren");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameTest_should_giveFalseWhenName_doesnotStartWithUpperCase() throws ValidationException{
        boolean result = user.validateFirstName("afreen");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameTest_should_giveTrueWhenName_containsMinimumThreeCharacters() throws ValidationException {
        boolean result = user.validateFirstName("Afr");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameTest_should_giveFalse_whenAllCharactersOfNameInUpperCase() throws ValidationException {
        boolean result = user.validateFirstName("FATHIMA");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameTest_should_giveFalse_whenAllCharactersOfNameInLowerCase() throws ValidationException{
        boolean result = user.validateFirstName("afreen");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTest_should_giveTrueWhenNameIsValid()throws ValidationException {
        boolean result = user.validateLastName("fathima");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameTest_should_giveFalseWhenName_doesnotStartWithUpperCase() throws ValidationException{
        boolean result = user.validateLastName("afreen");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTest_should_giveTrueWhenName_containsMinimumThreeCharacters() throws ValidationException{
        boolean result = user.validateLastName("afr");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameTest_should_giveFalse_whenAllCharactersOfNameInUpperCase() throws ValidationException{
        boolean result = user.validateLastName("AFREEN");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTest_should_giveFalse_whenAllCharactersOfNameInLowerCase() throws ValidationException{
        boolean result = user.validateLastName("fathima");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberTest_should_giveTrue_whenMobileeNumberIsValid() throws ValidationException{
        boolean result = user.validateMobileNo("91 987654321");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumberTest_should_giveFalse_whenMobileeNumberIsInValid() throws ValidationException{
        boolean result = user.validateMobileNo("987654321");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberTest_should_giveFalse_whenNoSpaceBetween_mobileeNumberAndCountryCode() throws ValidationException{
        boolean result = user.validateMobileNo("987654321");
        Assert.assertFalse(result);
    }

    @Test
    public void passwordTest_should_giveTrue_whenPasswordIsValid() throws ValidationException{
        boolean result = user.validatePassword("oneFine$Day123");
        Assert.assertTrue(result);
    }

    @Test
    public void passwordTest_should_giveFalse_whenPasswordIsInValid()throws ValidationException {
        boolean result = user.validatePassword("oneFine$Day");
        Assert.assertFalse(result);
    }

    @Test
    public void emailIdTest_should_giveTrue_whenEmailIdIsValid() throws ValidationException{
        boolean result = user.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void emailIdTest_should_giveFalse_whenEmailIdIsInValid() throws ValidationException{
        boolean result = user.validateEmail("abc@@bl.in");
        Assert.assertFalse(result);
    }
}