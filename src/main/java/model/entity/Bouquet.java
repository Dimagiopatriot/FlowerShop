package model.entity;

import model.entity.enums.*;

import java.util.ArrayList;

/**
 * Created by troll on 27.07.2017.
 */
public class Bouquet {

    private ArrayList<Flower> flowers;
    private Accessory bucket;
    private Accessory ribbon;
    private Accessory wrapper;
    private Size size;
    private Price price;
    private Event event;

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        if (flowers.size() > 0)
            this.flowers = flowers;
    }

    public Accessory getBucket() {
        return bucket;
    }

    public void setBucket(Accessory bucket) {
        setAccessory(this.bucket, bucket);
    }

    public Accessory getRibbon() {
        return ribbon;
    }

    public void setRibbon(Accessory ribbon) {
        setAccessory(this.ribbon, ribbon);
    }

    public Accessory getWrapper() {
        return wrapper;
    }

    public void setWrapper(Accessory wrapper) {
        setAccessory(this.wrapper, wrapper);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setStemTypeForFlowers(Stem stem){
        for (Flower flower : flowers){
            flower.setStem(stem);
        }
    }

    public void setFreshness(Freshness freshness){
        for (Flower flower : flowers){
            flower.setFreshness(freshness);
        }
    }

    private void setAccessory(Accessory thisAccessory, Accessory accessory){
        if (thisAccessory == null) thisAccessory = accessory;
    }
}
