package allure;

import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest extends TestBase {

    @Test
    public void issueSearch() {


        open(baseUrl);
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("allure");
        $(".header-search-input").submit();

        $(By.linkText("allure-framework/allure-java")).click();
        $("#issues-tab").click();
        $(withText("Allure processes leak when using allure:serve")).should(Condition.exist);


    }
}
