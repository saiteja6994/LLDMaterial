package com.scalar.lld.DesignPatterns.Builder.Factory;

import com.scalar.lld.DesignPatterns.Builder.Factory.Buttons.Button;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.menu;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory=flutter.getUIFactory(SupportedPlatform.ANDROID);
        Button button= uiFactory.createButton();
        button.click();

        menu men=uiFactory.createMenu();
        men.showMenu();

    }
}
