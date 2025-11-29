package withStrategy;

import withStrategy.strategy.DriveStrategy;
import withStrategy.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super( new SportsDriveStrategy());
    }
}
