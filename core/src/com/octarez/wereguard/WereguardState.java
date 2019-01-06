package com.octarez.wereguard;

import com.octarez.wereguard.model.NameGenerator;
import com.octarez.wereguard.model.WGCharacter;

public class WereguardState {

    public final WGCharacter[] ACTIVE_TEAM = new WGCharacter[4];

    public void generateNewTeam() {
        for (int i = 0; i < ACTIVE_TEAM.length; i++) {
            ACTIVE_TEAM[i] = new WGCharacter(NameGenerator.getRandomFirstName());
        }
    }
}
