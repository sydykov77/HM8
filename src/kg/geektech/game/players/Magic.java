package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() + 10);


        }
    }
}
