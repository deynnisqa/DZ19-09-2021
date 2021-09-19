package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static  void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTests() {


        open( "https://demoqa.com/text-box");
        $("#userName").setValue("Max");
        $("#userEmail").setValue("max@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Kreml");
        $("#submit").click();

        $( "#output #name").shouldHave(text("Max"));
        $( "#output #email").shouldHave(text("max@mail.ru"));
        $( "#output #currentAddress").shouldHave(text("Moscowqq"));
        $( "#output #permanentAddress").shouldHave(text("Kreml"));
       // $( "#output #permanentAddress").shouldHave(text("Kremll"));
