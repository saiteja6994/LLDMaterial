package com.scalar.lld.DesignPatterns.Builder.Factory;

import com.scalar.lld.DesignPatterns.Builder.Factory.Buttons.Button;
import com.scalar.lld.DesignPatterns.Builder.Factory.Buttons.IOSButton;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.IOSMenu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }
}
