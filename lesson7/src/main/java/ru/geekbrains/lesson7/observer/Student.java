package ru.geekbrains.lesson7.observer;

public class Student implements Observer{

    private String name;

    public String getName() {
        return name;
    }

    private int salary = 2000;
    private String searchingJob;

    private boolean gotOffer = false;


    public boolean isGotOffer() {
        return gotOffer;
    }

    public Student(String name, String searchingJob) {
        this.name = name;
        this.searchingJob = searchingJob;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary && this.searchingJob.equals(vacancy.toString())){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy,salary);
            this.salary = salary;
            gotOffer= true;

        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s;заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
