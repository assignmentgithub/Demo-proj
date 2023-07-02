package car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Engine { String typeOfEngine;
    double capacity;
    int maxRpm;
    int minRpm;

}

