package ru.geekbrains.lesson1;

public class Chocolate extends Product{

    private int cocoa; // процент содержания какао в шоколаде

    public int getCocoa() {return cocoa;}

    public void setCocoa(int cocoa) {this.cocoa = cocoa;}

    public Chocolate(String brand, String name, double price, int cocoa){
        super(brand, name,price);
        this.cocoa = cocoa;
          

    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - какао: %d%% ", brand, name, price, cocoa);
    }
}
