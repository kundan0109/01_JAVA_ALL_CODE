package Inheritance.inheritance;

public class Vehicle {
    public static void main(String[] args) {
        class Vehicle1 {
            int model;
            int year;
            String fuelType;
            int efficiency;
            int distanceTravelled;
            int maximumSpeed;

            Vehicle1(int model, int year, String fuelType) {
                this.model = model;
                this.year = year;
                this.fuelType = fuelType;
            }

            void fuelEfficiency() {
            }

            void distanceTravelled() {
            }

            void maximumSpeed() {
            }

        }
        class Truck extends Vehicle1 {

            Truck(int model, int year, String fuelTyoe, int efficiency, int distanceTravelled, int maximumSpeed) {
                super(model, year, fuelTyoe);
                this.efficiency = efficiency;
                this.distanceTravelled = distanceTravelled;
                this.maximumSpeed = maximumSpeed;

                System.out.println("Model : " + model);
                System.out.println("year : " + year);
                System.out.println("fuel type  : " + fuelTyoe);
                System.out.println("efficiency  : " + efficiency);
                System.out.println("distance travelled  : " + distanceTravelled);
                System.out.println("Maximum speed  : " + maximumSpeed);
            }


        }

        class Car extends Vehicle1 {
            Car(int model, int year, String fuelTyoe, int efficiency, int distanceTravelled, int maximumSpeed) {
                super(model, year, fuelTyoe);
                this.efficiency = efficiency;
                this.distanceTravelled = distanceTravelled;
                this.maximumSpeed = maximumSpeed;


                System.out.println("Model : " + model);
                System.out.println("year : " + year);
                System.out.println("fuel type  : " + fuelTyoe);
                System.out.println("efficiency  : " + efficiency);
                System.out.println("distance travelled  : " + distanceTravelled);
                System.out.println("Maximum speed  : " + maximumSpeed);
            }
        }
        Truck truck = new Truck(9899, 1999, "dimag", 1, 10, 15  );
        Car car = new Car(98029, 8529, "allu", 5, 12, 17  );
    }
}
