package oop.animal;

abstract class Hayvan {

    private String turAdi;
    private double agirlik;
    private int yas;

    public Hayvan(String turAdi,double agirlik,int yas){
        this.turAdi=turAdi;
        this.agirlik=agirlik;
        this.yas=yas;
    }

    public String getTurAdi(){
        return this.turAdi;
    }

    public double getAgirlik(){
        return this.agirlik;
    }

    public int getYas(){
        return this.yas;
    }

    public abstract double getDosage();

    public abstract String getFeedSchedule();


}
