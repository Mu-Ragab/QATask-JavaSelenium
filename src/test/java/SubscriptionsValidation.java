import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubscriptionsValidation extends BaseTests{

    SoftAssert softAssert;

    @Test
    public void testValidations()
    {
        homePage.openCountryList();
        homePage.selectEmirates();
        softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.getPackageType(), "CLASSIC");
        softAssert.assertEquals(homePage.getCost(), "From 10.00 AED/week");


        homePage.openCountryList();
        homePage.selectJordan();
        softAssert.assertEquals(homePage.getPackageType(), "CLASSIC");
        softAssert.assertEquals(homePage.getCost(), "From 0.99 JOD/week");

        homePage.openCountryList();
        homePage.selectTunisia();
        softAssert.assertEquals(homePage.getPackageType(), "CLASSIC");
        softAssert.assertEquals(homePage.getCost(), "From 1.00 TND/week");

        softAssert.assertAll();

    }
}
