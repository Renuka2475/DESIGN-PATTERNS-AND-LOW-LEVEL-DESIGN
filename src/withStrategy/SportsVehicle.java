package withStrategy;

import withStrategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
