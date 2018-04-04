package com.example.jmpokou.dagger_example.di;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest_di {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldAssignWeaponToPlayer() {
        Player player = new Player();
        DaggerPlayerComponent.create().inject(player);
        assertEquals("sword", player.weapon.name);
    }
}