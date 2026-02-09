package org.example;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import java.util.*;

public class Codegen {
        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();
                page.navigate("https://testautomationpractice.blogspot.com/");
                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Name")).click();
                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Name")).fill("Harikrishnan");
                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Name")).press("Tab");
                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter EMail")).fill("hari@gmail.com");
                page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("Male").setExact(true)).check();
                page.getByLabel("Country:").selectOption("germany");
                page.getByLabel("Colors:").selectOption("green");
                page.getByLabel("Sorted List:").selectOption("deer");
            }
        }
    }