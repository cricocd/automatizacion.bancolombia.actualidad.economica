package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NewsEconomic implements Question<Boolean> {

    private String pdfText;
    private String title = "Evoluci\u00f3n del contexto macroecon\u00f3mico";

    public NewsEconomic (String pdfText) {
        this.pdfText = pdfText;
    }

    public static NewsEconomic isCorrect(String pdfText) {
        return new NewsEconomic(pdfText);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        if(pdfText.contains(title)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
