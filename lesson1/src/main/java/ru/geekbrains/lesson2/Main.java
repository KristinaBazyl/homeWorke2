package ru.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, false);
        Plate plate = new Plate(100);


        plate.info();


        Cat [] cats = {
                cat,
                new Cat("Persik", 4, false),
                new Cat("Kotik", 5,false),
                new Cat("Ryzik",6, false),
        };

        for (int i =0; i < cats.length; i++){
                if (cats[i].getSatiety() == false){
                    cats[i].eat(cats[i].getAppetite(), plate.getFood());
                    plate.setFood(plate.getFood()- cats[i].getAppetite());
                    plate.supplementFood(plate.getFood());
                }

        }

        System.out.println(plate.getFood());


//        System.out.println(cat.satiety(cat.getAppetite(),plate.getFood()));



//        if(cat.getAppetite()<=plate.getFood()) {
//            plate.setFood(plate.getFood() - cat.getAppetite());
//            System.out.println(plate.getFood());
//        }
//        else{
//            System.out.println("кот много ест");
//        }




    }
}
