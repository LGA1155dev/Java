package understending.to.exercises.test;

import understending.to.exercises.domain.Ninja;
import understending.to.exercises.domain.RankNinja;

public class NinjaTest {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", 17, RankNinja.GENIN, 300);
        ninja.promover();
        System.out.println(ninja);
    }
}
