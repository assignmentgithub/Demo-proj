package car;



import interiors.Interiors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Car {

//   ( public Car(){
//        System.out.println("I am a constructor");
//    })  No Arguments constructor

//    (public Car(String manufacturerName, int yearOfManufacturing, String modelName, String fuelType){
//        this.manufacturerName = manufacturerName;
//        this.yearOfManufacturing = yearOfManufacturing;
//        this.modelName = modelName;
//        this.fuelType = fuelType;) All arguments constructor

//    }

    private Interiors interiors;
    private Engine engine;
    private String manufacturerName;
    private int yearOfManufacturing;
    private String modelName;
    private String fuelType;

    public void setFuelType(String fuelType) {
        if (fuelType.equalsIgnoreCase("Petrol") || fuelType.equalsIgnoreCase("Diesel")) {
            this.fuelType = fuelType;
        } else {
            //Throw Error
        }
    }
}
