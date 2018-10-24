package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class AndroidSearchPageObject extends SearchPageObject
{
    static {
        SEARCH_INIT_ELEMENT = "xpath://*[contains(@text, 'Search Wikipedia')]";
        SEARCH_INPUT = "xpath://*[contains(@text, 'Search…')]";
        SEARCH_CANCEL_BUTTON = "id:org.wikipedia:id/search_close_btn";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='{SUBSTRING}']";
        SEARCH_RESULT_ELEMENT = "xpath://*[@resource-id='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
        SEARCH_EMPTY_RESULT_ELEMENT = "//*[@text = 'No results found']";
//            SEARCH_RESULTS_LIST_ITEM = "id:org.wikipedia:id/page_list_item_container";
//            SEARCH_RESULTS_LIST_ITEM_TITLE = "id:org.wikipedia:id/page_list_item_title";
//            SEARCH_RESULT_BY_TITLE_AND_DESCRIPTION_TPL =
//                    "xpath://*[@resource-id='" + SEARCH_RESULTS_LIST_ITEM + "']" +
//                            "//*[@resource-id='" + SEARCH_RESULTS_LIST_ITEM_TITLE + "'][@text='{TITLE}']/" +
//                            "../*[@resource-id='org.wikipedia:id/page_list_item_description'][@text='{DESCRIPTION}']";
    }

    public AndroidSearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}