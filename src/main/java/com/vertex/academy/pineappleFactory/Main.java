package com.vertex.academy.pineappleFactory;

import com.vertex.academy.pineappleFactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println("ИНВЕНТАРИЗАЦИЯ ФРУКТОВ:");
        Pantry.PANTRY.inventoryFruit();
        Pantry.PANTRY.produce(factory, 10);
        System.out.println("\nИНВЕНТАРИЗАЦИЯ КОНСЕРВ:");
        Pantry.PANTRY.inventoryCanned();
    }
}
