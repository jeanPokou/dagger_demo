package com.example.jmpokou.dagger_example.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PlayerModule {
    @Provides
    @Singleton
    Weapon providesWeapon() {
        return  new Weapon("gun");
    }

}
