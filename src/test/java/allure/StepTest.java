package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepTest {

    public static final String allure = "allure";
    public static final String repo = "allure-framework/allure-java";
    public static final String issue = "Allure processes leak when using allure:serve";


    @Test
    public void StepTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebTestSteps steps = new WebTestSteps();

        steps.openMainPage();
        steps.searchAllure(allure);
        steps.clickOnRepositoryLink(repo);
        steps.openIssueTab();
        steps.shouldNameOfRepositoryExists(issue);

    }
}
