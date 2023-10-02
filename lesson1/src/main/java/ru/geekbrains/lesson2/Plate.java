package ru.geekbrains.lesson2;

public class Plate {
    protected int food;



    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }


    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    protected void supplementFood (int food){
        if (food<10){
            System.out.println("Добавьте еду в тарелку.");;
        }
        else {
            System.out.println("Можно кормить очередного кота");
        }

    }

}
