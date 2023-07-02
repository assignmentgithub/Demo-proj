import car.Car;

public class DemoProj {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.setFuelType("Petrol");
        C1.setManufacturerName("KIA");
        C1.setYearOfManufacturing( 2021 );
        C1.setModelName("Seltos");

        System.out.println("Car fuel type :" +C1.getFuelType());
        System.out.println("Car manufacturer name :" +C1.getManufacturerName());
        System.out.println("Car year of manufacturing :" +C1.getYearOfManufacturing());
        System.out.println("Car model name :" +C1.getModelName());


        Car C2 = new Car();
        C2.setFuelType("Diesel");
        C2.setManufacturerName("KIA");
        C2.setYearOfManufacturing( 2022 );
        C2.setModelName("Seltos");

        System.out.println("Car fuel type :" +C2.getFuelType());
        System.out.println("Car manufacturer name :" +C2.getManufacturerName());
        System.out.println("Car year of manufacturing :" +C2.getYearOfManufacturing());
        System.out.println("Car model name :" +C2.getModelName());



        Car C3 = new Car();
        C3.setFuelType("Water");
        C3.setManufacturerName("Hyundai");
        C3.setYearOfManufacturing( 2022 );
        C3.setModelName("Creta");


    }

}
