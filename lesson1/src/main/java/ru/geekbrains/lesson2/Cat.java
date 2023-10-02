package ru.geekbrains.lesson2;


public class Cat {
    private String name;
    protected int appetite;
    protected boolean satiety;

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(int appetite, int food) {
        if (appetite > 0 && food > 0) {

            if (appetite > food) {
                System.out.printf("Кот %s обжора! Необходимо добавить еды в тарелку! Его сытость = %b.\n ", name, satiety);


            } else {
                food -= appetite;
                satiety = true;
                System.out.printf("Котик %s сыт и набрался сил. В тарелке осталось %d еды, сытость кота = %b. \n", name, food, satiety);
            }
        }


    }

    public boolean satiety(int appetite, int food) {
        int res = food - appetite;
        return res >= 0;
    }


}