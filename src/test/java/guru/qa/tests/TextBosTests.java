package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBosTests {
    // Определяем с помощью BeforAll конфигурацию для всего текста
    @BeforeAll
    static void beforeall(){
    // Развертываем наш хром на весь экран
        Configuration.startMaximized = true;

    }
    // Начало теста
    @Test
    void fillFormTests() {
    // Определяем строковые переменные для теста
        String userName = "Max";
        String userEmail = "max@mail.com";
        String currentAddress = "Moscow";
        String permanentAddress = "Lugniki";

    // открываем тестируемую страницу
        open("https://demoqa.com/text-box");
    // C помощью setValue вставляем переменные
        $("#userName").setValue(userName);
        $("#userEmail").setValue(userEmail);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        $("#submit").click();
    // Сравниваем вставленные данные с внесенными
        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text(userEmail));
        $("#output #currentAddress").shouldHave(text(currentAddress));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));
       // $("#output #permanentAddress").shouldHave(text("Lugniki"));


    }
}
