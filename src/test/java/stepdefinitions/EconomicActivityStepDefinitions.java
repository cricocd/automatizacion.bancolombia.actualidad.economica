package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.ReadPdf;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;
import questions.NewsEconomic;
import tasks.Open;
import tasks.SearchNewsEconomic;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EconomicActivityStepDefinitions {

    private EnvironmentVariables environmentVariables;
    String downloadFolder;
    String fileName;

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Chris");
    }


    @Given("^Chris entered in the bancolombia page$")
    public void chrisEnteredInTheBancolombiaPage() {
        downloadFolder = environmentVariables.optionalProperty("download.filesFolder")
                .orElseThrow(IllegalArgumentException::new);

        fileName = environmentVariables.optionalProperty("statements.fileName")
                .orElseThrow(IllegalArgumentException::new);

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.bancolombiaHomePage());

    }

    @When("^he download the monthly economic report$")
    public void heDownloadTheMonthlyEconomicReport() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchNewsEconomic.andDownload());


    }

    @Then("^he should read the report correctly$")
    public void heShouldReadTheReportCorrectly() throws IOException {
        String statementFilePath = String.format("%s/%s", downloadFolder, fileName);
        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));
        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();
        theActorInTheSpotlight().should(seeThat(NewsEconomic.isCorrect(pdfText)));


    }
}
