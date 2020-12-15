package com.pioneers.daggertut;


import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent()
public  interface CoffeComponent {

    Coffe getCoffe();
    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder sugar(@Sugar int sugar);
        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeComponent build();
    }
}
