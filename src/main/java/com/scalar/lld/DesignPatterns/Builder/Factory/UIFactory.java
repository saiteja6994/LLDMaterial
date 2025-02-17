package com.scalar.lld.DesignPatterns.Builder.Factory;

import com.scalar.lld.DesignPatterns.Builder.Factory.Buttons.Button;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.IOSMenu;
import com.scalar.lld.DesignPatterns.Builder.Factory.Menu.menu;

public interface UIFactory {
    Button createButton();
    menu createMenu();
}
