package ru.geekbrains.lesson1.sample1;

import ru.geekbrains.lesson1.Product;

public class Program {

    public static void main(String[] args) {
        Product product1 = new Product("ООО Источник", "_", -200);
        //product1.name = "Бутылка с водой (1)";
        //product1.brand = "ООО Источник";
        //product1.price = 0;

        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Бутылка с водой (3)", 150);
        System.out.println(product3.displayInfo());

    }

}
