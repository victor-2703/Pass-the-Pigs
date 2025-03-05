public class PigDice {
    private static String dice() {
        double chance = Math.random();
        if(chance < 0.349) {
            return "Dot";
        }
        else if(chance < 0.349 + 0.302) {
            return "No Dot";
        }
        else if(chance < 0.349 + 0.302 + 0.224) {
            return "Razorback";
        }
        else if(chance < 0.349 + 0.302 + 0.224 + 0.088) {
            return "Trotter";
        }
        else if(chance < 0.349 + 0.302 + 0.224 + 0.088 + 0.03) {
            return "Snouter";
        }
        else {
            return "Leaning Jowler";
        }
    }
    
    public static int roll() {
        String dice1 = dice();
        String dice2 = dice();
        
        
        
        if((dice1.equals("Dot") && dice2.equals("No Dot")) || (dice1.equals("No Dot") && dice2.equals("Dot"))) {
            return 0;
        }
        else if(dice1.equals(dice2)) {
            if(dice1.equals("Dot") || dice1.equals("No Dot")) {
                return 1;
            }
            else if(dice1.equals("Razorback")) {
                return 20;
            }
            else if(dice1.equals("Trotter")) {
                return 20;
            }
            else if(dice1.equals("Snouter")) {
                return 40;
            }
            else {
                return 60;
            }
        }
        else {
            if(dice1.equals("Dot") || dice1.equals("No Dot")) {
                if(dice2.equals("Razorback")) {
                    return 5;
                }
                else if(dice2.equals("Trotter")) {
                    return 5;
                }
                else if(dice2.equals("Snouter")) {
                    return 10;
                }
                else {
                    return 15;
                }
            }
            else if(dice1.equals("Razorback")) {
                if(dice2.equals("Dot") || dice2.equals("No Dot")) {
                    return 5;
                }
                else if(dice2.equals("Trotter")) {
                    return 10;
                }
                else if(dice2.equals("Snouter")) {
                    return 15;
                }
                else {
                    return 20;
                }
            }
            else if(dice1.equals("Trotter")) {
                if(dice2.equals("Dot") || dice2.equals("No Dot")) {
                    return 5;
                }
                else if(dice2.equals("Razorback")) {
                    return 10;
                }
                else if(dice2.equals("Snouter")) {
                    return 15;
                }
                else {
                    return 20;
                }
            }
            else if(dice1.equals("Snouter")) {
                if(dice2.equals("Dot") || dice2.equals("No Dot")) {
                    return 10;
                }
                else if(dice2.equals("Razorback")) {
                    return 15;
                }
                else if(dice2.equals("Trotter")) {
                    return 15;
                }
                else {
                    return 25;
                }
            }
            else {
                if(dice2.equals("Dot") || dice2.equals("No Dot")) {
                    return 15;
                }
                else if(dice2.equals("Razorback")) {
                    return 20;
                }
                else if(dice2.equals("Trotter")) {
                    return 20;
                }
                else {
                    return 25;
                }
            }
        }
    }
}