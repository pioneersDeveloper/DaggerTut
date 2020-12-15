package com.pioneers.daggertut;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {RiverModule.class})
public interface AppComponent {
   CoffeComponent.Builder getCoffeComponentBuilder();
}
