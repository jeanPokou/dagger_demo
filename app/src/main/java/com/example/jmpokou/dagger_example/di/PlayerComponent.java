package com.example.jmpokou.dagger_example.di;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = PlayerModule.class)
public interface PlayerComponent {
    Player player();
}
