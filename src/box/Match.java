package box;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeigt;
    int maxWeight;



    Match(Fighter f1,Fighter f2,int minWeigt,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeigt=minWeigt;
    }

    public void run(){
        if (isCheck()){

            Random random = new Random();
            boolean isFirstFighterStarts = random.nextBoolean();

            Fighter firstFighter;
            Fighter secondFighter;

            if (isFirstFighterStarts){
                firstFighter=this.f1;
                secondFighter=this.f2;
            }else{
                firstFighter=this.f2;
                secondFighter=this.f1;
            }

            while (firstFighter.health>0&&secondFighter.health>0){

                System.out.println("---------YENİ ROUND ----------");

                firstFighter.health = secondFighter.hit(firstFighter);

               if (isWin()){
                   break;
               }

                secondFighter.health=firstFighter.hit(secondFighter);
                if (isWin()){
                    break;
                }

                System.out.println( this.f1.name + " sağlığı " + this.f1.health);
                System.out.println(this.f2.name + " sağlığı " + this.f2.health);

            }

        }else {
            System.out.println("sikletler uymuyor");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeigt && this.f1.weight<=maxWeight)&&(this.f2.weight<=maxWeight&&this.f2.weight>=minWeigt);
    }


    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name + " kazandı");
        return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı");
            return true;
     }
        return false;

    }

}
