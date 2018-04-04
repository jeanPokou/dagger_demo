package com.example.jmpokou.dagger_example.di;

import dagger.Module;
import dagger.Provides;

@Module
public class PlayerModule {

    @Provides
    Weapon providesWeapon(){
        return  new Weapon();
    }

}
