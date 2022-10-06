package tests;

import configuration.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTest extends TestBase {
    private static Logger logger= LoggerFactory.getLogger(WebsiteTest.class);

    @Test
    void checkTitle() {
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(System.getProperty("title"));
    }

//    @ParameterizedTest(name = "{0} has been verified")
//    @DisplayName("Check the page title")
//    @MethodSource("configuration.DataProvider#pageTitlesData")
//    @Tag("Regression")
//    void checkTitleBooking(String pageAddress, String expectedTitle) {
//        getDriver().get(pageAddress);
//        logger.info("My website address: "+ pageAddress);
//        String actualTitle = getDriver().getTitle();
//        assertThat(actualTitle).isEqualTo(expectedTitle);
//    }
}
