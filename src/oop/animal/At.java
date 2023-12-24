package oop.animal;

public class At extends Hayvan{

    public At(String turAdi,double agirlik , int yas){
        super(turAdi,agirlik,yas);
    }

    public double getDosage(){
        return getAgirlik()*0.1;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde iki kez";
    }


}
