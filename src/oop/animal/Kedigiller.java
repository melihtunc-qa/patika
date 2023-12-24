package oop.animal;

public class Kedigiller extends Hayvan{

    public Kedigiller(String turAdi,double agirlik,int yas){
        super(turAdi,agirlik,yas);
    }

    @Override
    public double getDosage() {
        return getAgirlik()*0.05;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde Bir kez";
    }
}



