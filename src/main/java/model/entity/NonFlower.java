package model.entity;

import model.entity.enums.NonPlantType;

/**
 * Created by troll on 27.07.2017.
 */
public class NonFlower extends Plant {

    private NonPlantType nonPlantType;

    public NonPlantType getNonPlantType() {
        return nonPlantType;
    }

    public void setNonPlantType(NonPlantType nonPlantType) {
        this.nonPlantType = nonPlantType;
    }
}
