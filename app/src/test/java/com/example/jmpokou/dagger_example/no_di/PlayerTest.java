package com.example.jmpokou.dagger_example.no_di;

import com.example.jmpokou.dagger_example.no_di.Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void  shouldAssignWeaponToPlayer() {
        Player player = new Player();
        assertEquals("sword", player.mainWeapon.name);
    }


}