package allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class WebTestSteps extends TestBase {


    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(baseUrl);

    };

    @Step("Ищем репозитории по введенному запросу {allure}")
    public void searchAllure(String allure) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("allure");
        $(".header-search-input").submit();
    };


    @Step("Кликаем по нужному репозиторию {repo}")

    public void clickOnRepositoryLink(String repo) {
        $(By.linkText("allure-framework/allure-java")).click();
    };



    @Step("Открываем таб Issue")
    public void openIssueTab() {
        $("#issues-tab").click();
    };



    @Step("Проверяем название issue {issue}")

    public void shouldNameOfRepositoryExists(String issue) {
        $(withText("Allure processes leak when using allure:serve")).should(Condition.exist);
    };

}

