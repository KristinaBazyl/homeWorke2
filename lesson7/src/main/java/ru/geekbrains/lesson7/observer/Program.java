package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();


//        Vacancy vacancy = Vacancy.values()[new Random().nextInt(Vacancy.values().length)];
        Vacancy assistent = Vacancy.ассисент;
        Vacancy programmer = Vacancy.программист;
        Vacancy lawyer = Vacancy.юрист;


        Company google = new Company("Google", jobAgency, 120000, assistent);
        Company yandex = new Company("Yandex", jobAgency, 95000, programmer);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000, lawyer);

        Student student1 = new Student("Студент #1", "юрист");
        Student student2 = new Student("Студент #2", "ассистент");
        Master master1 = new Master("Мастер #1","ассистент" );
        Master master2 = new Master("Мастер #2","программист");
        Junior junior = new Junior("Джун", "ассистент");




        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(junior);




        for (int i = 0; i < 2; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
//            if(student1.isGotOffer() == true){
//
//                jobAgency.removeObserver(student1);
//                System.out.printf("%s нашел работу \n",student1.getName());
//            }

        }

//        if(student1.isGotOffer() == true){
//            jobAgency.removeObserver(student1);
//        }
    }

}
