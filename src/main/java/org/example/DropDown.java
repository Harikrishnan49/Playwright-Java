package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser launch = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
        Page page = launch.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        page.selectOption("id=country", "Germany");
        page.selectOption("id=colors", "Yellow");
        Locator locator = page.locator("id=animals");
        locator.selectOption(new SelectOption().setIndex(1));
        //locator.selectOption(new String[] {"Cat", "Deer", "Dog"});
        //Locator locator1 = page.locator("select");
        Locator option = locator.locator("option");
        List<String> strings = option.allInnerTexts();
        System.out.println(strings);
        int count = option.count();
        System.out.println(count);
    }
}
