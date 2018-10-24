package tests;

import lib.CoreTestCase;
import lib.ui.WelcomePageObject;
import org.junit.Test;

public class getStartedCase extends CoreTestCase {

    @Test
    public void testPassThroughWelcome()
    {
        if (this.Platform.isAndroid())
        {
            return;
        }
        WelcomePageObject WelcomePageObject = new WelcomePageObject(driver);
        WelcomePageObject.waitForLearnMoreLink();
        WelcomePageObject.clickNextButton();

        WelcomePageObject.waitForNewWaysToExploreText();
        WelcomePageObject.clickNextButton();

        WelcomePageObject.waitForAddOrEditPreferredLanguages();
        WelcomePageObject.clickNextButton();

        WelcomePageObject.waitForLearnMoreAboutDataCollected();
        WelcomePageObject.clickGetStartedButton();

    }
}
