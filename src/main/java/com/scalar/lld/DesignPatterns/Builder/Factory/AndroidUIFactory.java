package com.scalar.lld.DesignPatterns.Builder.Factory;

import com.scalar.lld.DesignPatterns.Builder.Factory.Buttons.AndroidButton;
import com.scalar.lld.DesignPatterns.Builder.Factory.Buttons.Button;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.AndroidMenu;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.IOSMenu;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public menu createMenu() {
        return new AndroidMenu();
    }
}
