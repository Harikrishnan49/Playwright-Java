package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OpenGoogle {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setChannel("chrome")
                        .setHeadless(false)
        );
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        //page.locator("//input[@id='name']").fill("Harikrishnan");
        page.locator("//input[@id='name']").type("Harikrishnan");
        //playwright.close();
    }
}
