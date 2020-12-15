package com.pioneers.daggertut;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    @Singleton
    @Provides
    River provideRiver(){
        return new River();
    }

}
