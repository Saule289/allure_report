package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WebTestSteps {

    public static final String allure = "allure";
    public static final String repo = "allure-framework/allure-java";
    public static final String issue = "Allure processes leak when using allure:serve";


    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com/");
    }

    ;

    @Step("Ищем репозитории по введенному запросу {allure}")
    public void searchAllure(String allure) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("allure");
        $(".header-search-input").submit();
    }

    ;

    @Step("Кликаем по нужному репозиторию {repo}")

    public void clickOnRepositoryLink(String repo) {
        $(By.linkText("allure-framework/allure-java")).click();
    }

    ;

    @Step("Открываем таб Issue")
    public void openIssueTab() {
        $("#issues-tab").click();
    }

    ;

    @Step("Проверяем название issue {issue}")

    public void shouldNameOfRepositoryExists(String issue) {
        $(withText("Allure processes leak when using allure:serve")).should(Condition.exist);
    };

}

