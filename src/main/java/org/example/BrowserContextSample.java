package org.example;

import com.microsoft.playwright.*;

public class BrowserContextSample {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch( new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome")
        );
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        page.locator("//input[@placeholder='Username']").fill("Admin");
        page.locator("//input[@placeholder='Password']").fill("admin123");
        page.locator("//button[normalize-space()='Login']").click();
        String dashboard = page.locator("//h6[normalize-space()='Dashboard']").textContent();
        System.out.println(dashboard);

        Page page1 = context.newPage();
        page1.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        dashboard = page.locator("//h6[normalize-space()='Dashboard']").textContent();
        System.out.println(dashboard);
    }
}
