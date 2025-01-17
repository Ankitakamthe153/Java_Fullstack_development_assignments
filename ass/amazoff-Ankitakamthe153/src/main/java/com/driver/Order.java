package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM

        this.id = id;
        this.deliveryTime = simpleTime(deliveryTime);
    }

    public int simpleTime(String deliveryTime) {

        //deliveryTime  = HH*60 + MM
        int hours = Integer.parseInt(deliveryTime.substring(0, 2));
        int mins = Integer.parseInt(deliveryTime.substring(3));

        int time = hours * 60 + mins;
        return time;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}

    public void setId(String id) {
        this.id = id;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
