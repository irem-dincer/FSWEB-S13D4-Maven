package org.example;



public class Player {

    private String name;
   private  int healthPercentage;
    private Weapon weapon;




public Player(String name , int healthPercentage , Weapon weapon) {
    this.name=name;
    this.weapon=weapon;


    if(healthPercentage>100){ //player objesi oluşturulduğu anda eğer healthPercentage 100'den büyük verildiyse, 100 değerine set edilmeli. Eğer healthPercentage 0'dan küçük verildiyse 0'a set edilmeli.
       this.healthPercentage=100;
    }
    else if(healthPercentage<0){
         this.healthPercentage=0;
    }

else {
    this.healthPercentage=healthPercentage;
    }
}



public int healthRemaining(){  //health Remaining method should return the health Percentage value.
    return healthPercentage;
}


public int loseHealth(int damage) {
    this.healthPercentage = healthPercentage - damage;
    if (this.healthPercentage <= 0) {
        System.out.println(name + " player has been knocked out of game");
        this.healthPercentage=0;
    }
return this.healthPercentage;
}

public int restoreHealth(int healthPotion){
    this.healthPercentage=healthPercentage+healthPotion;
    if(this.healthPercentage>100){
   this.healthPercentage=100;
    }
    return this.healthPercentage;
}



}
