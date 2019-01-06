package com.octarez.wereguard.screens.greathall;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.octarez.wereguard.WereguardCore;

abstract class TeamBoxes {

    private static final int NUMBER_TEAM_BOXES = WereguardCore.WEREGUARD_STATE.ACTIVE_TEAM.length;

    private static final float SINGLE_TEAMBOX_HEIGHT = GreatHallScreen.OUTSIDE_BOX_HEIGHT * 0.25f;
    private static final float SINGLE_TEAMBOX_WIDTH = GreatHallScreen.OUTSIDE_BOX_WIDTH * 0.20f;
    private static final float SINGLE_TEAMBOX_BUFFER = (GreatHallScreen.OUTSIDE_BOX_WIDTH - (NUMBER_TEAM_BOXES*SINGLE_TEAMBOX_WIDTH))/(NUMBER_TEAM_BOXES+1);

    private static final float TEAMBOX_BL_Y = GreatHallScreen.OUTSIDE_BOX_BL_Y + GreatHallScreen.OUTSIDE_BOX_HEIGHT * 0.5f;

    static void renderTeamBoxes(ShapeRenderer shapeRenderer) {
        shapeRenderer.translate(GreatHallScreen.OUTSIDE_BOX_BL_X, TEAMBOX_BL_Y, 0);
        for(int teamBoxIndex = 0; teamBoxIndex<NUMBER_TEAM_BOXES; teamBoxIndex++) {
            shapeRenderer.translate(SINGLE_TEAMBOX_BUFFER, 0, 0);
            shapeRenderer.rect(0, 0, SINGLE_TEAMBOX_WIDTH, SINGLE_TEAMBOX_HEIGHT);

            shapeRenderer.translate(SINGLE_TEAMBOX_WIDTH, 0, 0);
        }
        shapeRenderer.translate(-NUMBER_TEAM_BOXES*SINGLE_TEAMBOX_BUFFER + -NUMBER_TEAM_BOXES* SINGLE_TEAMBOX_WIDTH, 0, 0);

        shapeRenderer.translate(-GreatHallScreen.OUTSIDE_BOX_BL_X, -TEAMBOX_BL_Y, 0);
    }
}
