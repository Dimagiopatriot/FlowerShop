package model.entity;

import model.entity.enums.Freshness;
import model.entity.enums.Inflorescence;
import model.entity.enums.Stem;

/**
 * Created by troll on 26.07.2017.
 */
public class Flower extends Plant {

    private Freshness freshness;
    private Inflorescence inflorescence;
    private Stem stem;

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public Inflorescence getInflorescence() {
        return inflorescence;
    }

    public void setInflorescence(Inflorescence inflorescence) {
        this.inflorescence = inflorescence;
    }

    public Stem getStem() {
        return stem;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }
}
