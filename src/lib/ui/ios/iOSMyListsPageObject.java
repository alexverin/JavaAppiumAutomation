package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsPageObject;

public class iOSMyListsPageObject extends MyListsPageObject {

    static {
        ARTICLE_BY_TITLE_TPL = "xpath://XCUIElementTypeCell/XCUIElementTypeLink[contains(@name,'{TITLE}')]";
        CLOSE_SYNC_ARTICLE_DIALOG = "id:places auth close";

    }
    public iOSMyListsPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
