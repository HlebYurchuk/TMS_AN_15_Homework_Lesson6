package com.teachmeskills.lesson6.part_1.store_service.model.container;

public class ShipСontainer {

    // Fields
    int width;
    int length;
    int depth;
    String containerModel;
    int price;

    // TODO
    // доваить еще одно для описание стоимости контейнера (done)


    // Constructors
    public ShipСontainer() {
        System.out.println("без параметрами");
        this.width = 10;
        this.length = 20;
        this.depth = 30;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipСontainer(int width, int length, int depth) {
        System.out.println("с параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipСontainer(int width, int length, int depth, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = boxModel;
    }
    public ShipСontainer(int width, int length, int depth, String containerModel,int price){
        System.out.println("С параметрами, с типом модели, со стоимостью");
        this.width = width;
        this.length=length;
        this.depth=depth;
        this.containerModel =containerModel;
        this.price=price;
    }

}
