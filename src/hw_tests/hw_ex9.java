//package hw_tests;
//
//import lib.CoreTestCase;
//import lib.ui.SearchPageObject;
//import lib.ui.factories.SearchPageObjectFactory;
//import org.junit.Test;
//
//public class hw_ex9 extends CoreTestCase {
//
//
//    /**
//     * Ex9*: Рефакторинг темплейта
//     * В одном из занятий четвертого урока упоминается о методе темплейтов. Там рассказано, как работать с локаторами, которые зависят от подстроки SUBSTRING.
//     * В примере из теста у нас всего одна подстрока. Но подобные локаторы можно строить с любым количеством подстрок.
//     * В приложении Wikipedia результатом поиска является набор ссылок на статьи, и каждая ссылка содержит как заголовок статьи, так и краткое описание.
//     * Например, для запроса “Java” одним из результатов выдачи будет “Java (Programming language)” и описание “Object-oriented programming language”.
//     * Задача:
//     * 1. Подобрать локатор, который находит результат поиска одновременно по заголовку и описанию (если заголовок или описание отличается - элемент не находится).
//     * 2. Добавить соответствующий метод в секцию TEMPLATES METHODS класса SearchPageObjectFactory.
//     * 3. В этот же класс добавить метод waitForElementByTitleAndDescription(String title, String description). Он должен дожидаться результата поиска по двум строкам - по заголовку и описанию.
//     * Если такой элемент не появляется, тест должен упасть с читаемой и понятной ошибкой.
//     * 4. Написать тест, который будет делать поиск по любому запросу на ваш выбор (поиск по этому слову должен возвращать как минимум 3 результата).
//     * 5. Далее тест должен убеждаться, что первых три результата присутствуют в результате поиска.
//     *
//     * Результатом выполнения задания должен быть дифф к коду, который был написан на четвертом занятий.
//     * В этом диффе должны быть вспомогательные методы, лежащие в соответствующих классах и код теста, лежащего в соответствующем классе.
//     * Тест должен работать (т.е. проходить при верном результате поиска и обязательно падать, если результат поиска изменился).
//     */
//
//    @Test
//    public void testSearchByTitleAndDescription()
//    {
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Java");
//        int amount_of_search_result = SearchPageObject.getAmountOfFoundArticles();
//        assertTrue(
//                "Found less than 3 search results",
//                amount_of_search_result > 3
//        );
//        SearchPageObject.waitForElementByTitleAndDescription("Java","Island of Indonesia");
//        SearchPageObject.waitForElementByTitleAndDescription("Java (programming language)", "Object-oriented programming language");
//        SearchPageObject.waitForElementByTitleAndDescription("JavaScript","Programming language");
//        SearchPageObject.clickCancelSearch();
//    }
//}
