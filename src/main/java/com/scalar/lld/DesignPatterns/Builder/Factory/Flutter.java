package com.scalar.lld.DesignPatterns.Builder.Factory;

public class Flutter {
    UIFactory getUIFactory(SupportedPlatform platform) {
        if(platform.equals(SupportedPlatform.ANDROID)) {
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS)) {
            return new IOSUIFactory();
        }
        return null;
    }
}
