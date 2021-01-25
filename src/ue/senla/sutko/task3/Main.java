package ue.senla.sutko.task3;

public class Main {
    public static void main(String[] args) {
        //первая задача
        int count=0;
        while (count<10){

            Cat Cat1 = new Cat("BArsik",3);
            System.out.println("Имя кота-"+Cat1.CatName +" Возраст-"+Cat1.CatAge);
            count++;
        }

        //вторая задача
        for (int i=0;i<10;i++){

            Cat Cat2= new Cat("Murca",4);
            Cat2.setCatName("Murka");
            Cat2.setCatAge(2);
            System.out.println("Имя кота-"+Cat2.getCatName() +" Возраст-"+Cat2.getCatAge());
        }

        //третья задача
        count=0;
        do {
            Cat Cat3 =new Cat("Boris",5);
            System.out.println("Имя кота-"+Cat3.getCatName() +" Возраст-"+Cat3.getCatAge());
            count++;
        }while (count<10);

        //четвертая задача
        Cat array[] = new Cat[5] ;
        for (Cat d:array) {
        Cat Cat4 = new Cat("Mur",12);
        System.out.println("Имя кота-"+Cat4.getCatName() +" Возраст-"+Cat4.getCatAge());
        }
    }
}
