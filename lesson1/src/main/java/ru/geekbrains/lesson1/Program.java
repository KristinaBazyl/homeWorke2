package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -200);
        //product1.name = "Бутылка с водой (1)";
        //product1.brand = "ООО Источник";

        product1.setPrice(-10);
        product1.setName("");

        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Бутылка с водой (3)", 150);
        System.out.println(product3.displayInfo());

        Product bottleOfWater =
                new BottleOfWater("ООО Источник", "Бутылка с водой (4)", 250, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 310, 0.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 330, 1.5, 15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 340, 2.5, 35);
        System.out.println(bottleOfMilk3.displayInfo());

        Product bottleOfMilk4 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 350, 1.5, 25);
        System.out.println(bottleOfMilk4.displayInfo());

        Product chocolate1 =
                new Chocolate("Красный октябрь", "Бабаевский", 150, 75);
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 =
                new Chocolate("Красный октябрь", "Бабаевский с миндалем", 130, 58);
        System.out.println(chocolate1.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(chocolate1);
        products.add(chocolate2);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleofMilk(1.5, 15);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }

    }

}
