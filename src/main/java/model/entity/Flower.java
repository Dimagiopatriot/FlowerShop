package model.entity;

import model.entity.enums.Inflorescence;
import model.entity.enums.Stem;

/**
 * Created by troll on 26.07.2017.
 */
public class Flower extends Plant {

    private Inflorescence inflorescence;
    private Stem stem;
    private boolean isNeedFeeding;
    private boolean isNeedSupport;

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

    public boolean isNeedFeeding() {
        return isNeedFeeding;
    }

    public void setNeedFeeding(boolean needFeeding) {
        isNeedFeeding = needFeeding;
    }

    public boolean isNeedSupport() {
        return isNeedSupport;
    }

    public void setNeedSupport(boolean needSupport) {
        isNeedSupport = needSupport;
    }
}
