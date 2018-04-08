package com.example.jmpokou.dagger_example;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void satisfyMainActivityDependency(MainActivity activity);
}
