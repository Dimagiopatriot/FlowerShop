package model.entity;

import model.entity.enums.Freshness;

/**
 * Created by troll on 26.07.2017.
 */
public class Plant {

    private Freshness freshness;

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }
}
