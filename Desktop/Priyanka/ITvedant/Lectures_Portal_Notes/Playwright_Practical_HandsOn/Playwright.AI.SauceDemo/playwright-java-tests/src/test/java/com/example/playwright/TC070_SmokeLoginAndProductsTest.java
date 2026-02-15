package com.example.playwright;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC070_SmokeLoginAndProductsTest extends TestBase {
    private final String BASE = "https://www.saucedemo.com/";

    @Test
    public void loginShowsProductsAndEmptyCart() throws Exception {
        try {
            page.navigate(BASE);
            page.fill("#user-name", "standard_user");
            page.fill("#password", "secret_sauce");
            page.click("#login-button");

            assertTrue(page.url().contains("inventory.html"));
            assertTrue(page.isVisible(".inventory_list"));
            assertTrue(!page.isVisible(".shopping_cart_badge"));
        } catch (Throwable t) {
            captureScreenshot("TC070_smokeLoginProducts");
            throw t;
        } finally {
            moveLatestVideo("TC070_smokeLoginProducts");
        }
    }
}
