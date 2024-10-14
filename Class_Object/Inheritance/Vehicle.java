package Class_Object.Inheritance;

public class Vehicle {
        String  make;
        String model;
        int year;
        Vehicle(String make , String model,int year){
            this.make= make;
            this.model=model;
            this.year=year;

        }
        public void display(){
            System.out.println(" make="+make);
            System.out.println(" model="+model);
            System.out.println(" year="+year);
        }

    }
    class Car extends Vehicle{
        int doors;
        Car(String make, String model, int year, int doors ){
            super(make,model,year);
            this.doors=doors;
        }
        public void  numberOfdoors(){
            super.display();
            System.out.println("number of doors= "+doors);
        }


    }


    class Motorcycle extends  Vehicle{
      String side_car;
      Motorcycle( String make, String model, int year,String side_car){
          super(make,model,year);
          this.side_car=side_car;
      }
      public void HasSidecar(){
          super.display();
          System.out.println("has a side car:-"+side_car);
      }
    }



    class Main {
        public static void main(String[] args) {
            Car car=new Car("suv","xyz123",2023,5);
           car.numberOfdoors();
           Motorcycle motorcycle=new Motorcycle("cidan","ert11", 1999,"yes");
           motorcycle.HasSidecar();

        }
    }





