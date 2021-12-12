// Dice class


import java.util.Random;
class Dice {
    private int noOfdices;

    public Dice(int noOfdices) {
        this.noOfdices = noOfdices;
    }

    public int rollValue() {
        return new Random().nextInt(6) + 1;
    }

}

// class Dice with six
class SingleDice extends Dice {
    private int noOfdices = 1;

    public SingleDice() {
        super(1);
    }

    public int rollValue() {
        int val = new Random().nextInt(6) + 1;
        if (val == 6) {
            while (true) {
                val = 6 + new Random().nextInt(6) + 1;
                if (val == 12) {
                    val = 12 + new Random().nextInt(6) + 1;
                    if (val == 18) {
                        System.out.println("3 6's . Better Luck");
                        val = 0;
                        break;
                    } else {
                        break;
                    }

                } else {
                    break;
                }
            }

        }

        return val;

    }
}
