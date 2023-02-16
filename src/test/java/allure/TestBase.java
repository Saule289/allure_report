package allure;



import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    static String allure = "allure";
    String repo = "allure-framework/allure-java";
    String issue = "issue_to_test_allure_report";
    String baseUrl = "https://github.com";

    public static void beforeAll() {
        SelenideLogger.addListener(allure, new AllureSelenide());

    }
}
