package com.example.jmpokou.dagger_example.di;

import dagger.Component;

@Component(modules = PlayerModule.class)
public interface PlayerComponent {
   void inject(Player player);
}
