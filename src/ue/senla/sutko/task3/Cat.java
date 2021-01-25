package ue.senla.sutko.task3;

public class Cat {

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String catName) {
        CatName = catName;
    }

    public int getCatAge() {
        return CatAge;
    }

    public void setCatAge(int catAge) {
        CatAge = catAge;
    }

    String CatName = "Barsik";
    int CatAge = 1;

       public Cat(String A,int B){
       CatName=A;
       CatAge =B;
   }


}
