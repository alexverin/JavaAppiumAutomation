package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class iOSSearchPageObject extends SearchPageObject
{
    static {
        SEARCH_INIT_ELEMENT = "xpath://XCUIElementTypeSearchField[@name='Search Wikipedia']";
        SEARCH_INPUT = "xpath://XCUIElementTypeSearchField[@value='Search Wikipedia']";
        SEARCH_CANCEL_BUTTON = "id:Close";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUIElementTypeLink[contains(@name, '{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "xpath://XCUIElementTypeLink";
        SEARCH_EMPTY_RESULT_ELEMENT = "//xpath://XCUIElementTypeStaticText[@name='No results found']";
//            SEARCH_RESULTS_LIST_ITEM = "id:org.wikipedia:id/page_list_item_container";
//            SEARCH_RESULTS_LIST_ITEM_TITLE = "id:org.wikipedia:id/page_list_item_title";
//            SEARCH_RESULT_BY_TITLE_AND_DESCRIPTION_TPL =
//                    "xpath://*[@resource-id='" + SEARCH_RESULTS_LIST_ITEM + "']" +
//                            "//*[@resource-id='" + SEARCH_RESULTS_LIST_ITEM_TITLE + "'][@text='{TITLE}']/" +
//                            "../*[@resource-id='org.wikipedia:id/page_list_item_description'][@text='{DESCRIPTION}']";
    }

    public iOSSearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
