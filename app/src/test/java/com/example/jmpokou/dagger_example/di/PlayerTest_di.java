package com.example.jmpokou.dagger_example.di;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest_di {

    @Test
    public void shouldAssignWeaponToPlayer() {
       Player player =  DaggerPlayerComponent.builder().build().player();
       assertEquals("gun", player.getMainWeapon().name);
    }

    @Test
    public void weaponShouldBeUnique() {
        PlayerComponent playerComponent = DaggerPlayerComponent.builder().build();
        Player player_1 = playerComponent.player();
        Player player_2 = playerComponent.player();
        assertEquals(player_1.getMainWeapon(), player_2.getMainWeapon());
    }
}