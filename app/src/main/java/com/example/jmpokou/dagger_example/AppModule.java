package com.example.jmpokou.dagger_example;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    private Application application;

    @Singleton
    @Provides
    Application providesApplication() {
        return application;
    }


}
