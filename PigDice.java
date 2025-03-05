public class PigDice {
    private static int dice() {
        double chance = Math.random();
        if(chance < 0.349) {
            return 1;
        }
        if(chance < 0.349 + 0.302) {
            return 0;
        }
        if(chance < 0.349 + 0.302 + 0.224) {
            return 5;
        }
        if(chance < 0.349 + 0.302 + 0.224 + 0.03) {
            return 10;
        }
        else {
            return 15;
        }
    }
}