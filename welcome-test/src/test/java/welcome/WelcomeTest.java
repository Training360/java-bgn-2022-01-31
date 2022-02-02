package welcome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeTest {

    @Test
    void testInputMyNameThanPressButtonThanCheckHelloMessage() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.go();
        welcomePage.type("John Doe");
        welcomePage.click();
        String message = welcomePage.readMessage();
        assertEquals("Hello John Doe!", message);
    }

    @Test
    void testInputMyNameThanPressButtonThanCheckHelloMessage2() {
        String message = new WelcomePage()
                .go()
                .type("Jack Doe")
                .click()
                .readMessage();
        assertEquals("Hello Jack Doe!", message);
    }
}
