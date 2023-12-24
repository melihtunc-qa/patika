package oop.animal;

public class Kemirgenler extends Hayvan {
    public Kemirgenler(String turAdi,double agirlik , int yas){
        super(turAdi,agirlik,yas);
    }

    @Override
    public double getDosage() {
        return getAgirlik()*0.02;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde üç kez";
    }
}
