package com.example.jmpokou.dagger_example.di;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Player {

    private final  Weapon mainWeapon;
    public Weapon getMainWeapon() {
        return this.mainWeapon;
    }
    @Inject
    Player( Weapon weapon) {
      this.mainWeapon = weapon ;
    }

}
