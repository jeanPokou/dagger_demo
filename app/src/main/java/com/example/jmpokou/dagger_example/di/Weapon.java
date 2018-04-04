package com.example.jmpokou.dagger_example.di;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Weapon {
   public String name = "sword";

   public Weapon(String name ) {
      this.name = "gun";
   }

}
