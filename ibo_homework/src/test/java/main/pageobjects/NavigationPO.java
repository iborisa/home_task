package main.pageobjects;

import com.google.common.base.Preconditions;

public class NavigationPO extends Page {

    public void navigateToUrl(String url) {
        Preconditions.checkNotNull(url, "requested url = null");
        driver.get(url);
    }
}
