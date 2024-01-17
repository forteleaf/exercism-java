public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;

    }

    public int remainingMinutesInOven(int value) {
        return expectedMinutesInOven() - value;


    }

    public int preparationTimeInMinutes(int value) {
        return value * 2;
    }

    public int totalTimeInMinutes(int a, int b) {
        return preparationTimeInMinutes(a) + b;
    }
}
