package tests;

import configuration.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTest extends TestBase {

    @ParameterizedTest(name = "{0} has been verified")
    @DisplayName("Check the page title")
    @MethodSource("configuration.DataProvider#pageTitlesData")
    @Tag("Regression")
    void checkTitleBooking(String pageAddress, String expectedTitle) {
        getDriver().get(pageAddress);
        String actualTitle = getDriver().getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
