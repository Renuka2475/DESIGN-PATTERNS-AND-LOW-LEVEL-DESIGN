package withStrategy;

import withStrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
