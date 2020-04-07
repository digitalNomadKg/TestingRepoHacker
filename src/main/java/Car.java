// DataTypes

public class Car {

    private int minSpeed = 0, maxSpeed = 100;
    private double weight = 2750;
    private boolean isTheCarOn = false;
    private char condition = 'A';
    private String nameOfCar = "Honda Jazz";
    private double maxFuel = 16.0;
    private double currentFuel = 8.0;
    private double mpg = 26.4;

    private int numberOfPeopleInCar = 1;
    private int maxNumberOfPeopleInCar = 6;

//f(x) = x+1;
// say: =5;
// f(5) = 5+1=6;

    private Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn, char customCondition, String customNameOfCar, double customMaxFuel,
               double customCurrentFuel, int customNumberOfPeopleInCar) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        condition = customCondition;
        nameOfCar = customNameOfCar;
        maxFuel = customMaxFuel;
        currentFuel = customCurrentFuel;
        numberOfPeopleInCar = customNumberOfPeopleInCar;
    }


    private void printVariables() {
        System.out.println("MaxSpeed is: " + maxSpeed);
        System.out.println("MinSpeed is: " + minSpeed);
        System.out.println("The weight of the car is: " + weight);
        System.out.println("The car is working? " + isTheCarOn);
        System.out.println("What is the condition of the car? " + condition);
        System.out.println("The name of the car is: " + nameOfCar);
        System.out.println("The maxLevel of fueltank is: " + maxFuel);
        System.out.println("The level of the fuel now is: " + currentFuel);
        System.out.println("Amount of the passengers: " + numberOfPeopleInCar);
        System.out.println("howManyMilesTillOutOfGas: " + howManyMilesTillOutOfGas());
        System.out.println("maxMilesPerFillUp: " + maxMilesPerFillUp());

    }


    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone got in");

        } else {
            System.out.println("The car is full: " + numberOfPeopleInCar + "=" + maxNumberOfPeopleInCar);

        }
    }

    private void getOut() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        }else {
            System.out.println("No one is the car");
        }
    }

    private double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    private double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    private void turnTheCarOn() {
        if (!isTheCarOn) {  //!isTheCarOn
            isTheCarOn = true;
        }
    }


    public static void main(String[] args) {
        Car birthdayPresent = new Car(900, 1500, false, 'B',
                "Mercedes-Benz", 45, 32, 1);
        birthdayPresent.printVariables();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        Car christmasPresent = new Car(650, 1250, true, 'A',
                "Lamborgini", 60, 55, 3);
        christmasPresent.printVariables();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");


        Car familyCar = new Car(120, 4500, true, 'A',
                "Toyota Sequoia", 80, 45, 5);
        familyCar.printVariables();
    }
}
