package allure;


import org.junit.jupiter.api.Test;


public class StepTest extends TestBase {


    @Test
    public void checkNameOfRepo() {
         WebTestSteps steps = new WebTestSteps();

        steps.openMainPage();
        steps.searchAllure(allure);
        steps.clickOnRepositoryLink(repo);
        steps.openIssueTab();
        steps.shouldNameOfRepositoryExists(issue);

    }
}
