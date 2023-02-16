package allure;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class TestLambdaTest extends TestBase {


    @Test
    public void testLamdaStep() {

        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });

        step("Ищем репозитории по введенному запросу  " + allure, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(allure);
            $(".header-search-input").submit();
        });

        step("Кликаем по нужному репозиторию  " + repo, () -> {

            $(By.linkText("allure-framework/allure-java")).click();
        });
        step("Открываем таб Issue", () -> {
            $("#issues-tab").click();
        });

        step("проверяем название issue c   " + issue, () -> {
            $(withText("Allure processes leak when using allure:serve")).should(Condition.exist);
        });

    }
}
