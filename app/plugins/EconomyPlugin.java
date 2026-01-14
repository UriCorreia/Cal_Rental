package app.plugins;

import Interface.IVehiclePlugin;
import java.math.BigDecimal;
import java.util.map;

public class EconomyPlugin implements IVehiclePlugin {
    
    @Override
    public String getVehicleType(){
        return "Economy";
    }

    @Override
    public BigDecimal calculateTotal(int days, BigDecimal baseRate, Map<String, Double> fees){

        Double taxa;

        if (additionalFees != null && additionalFees.containsKey("broken")) {
            taxa = additionalFees.get("broken");
        }

        BigDecimal total = dailyRate.multiply(BigDecimal.valueOF(days)) + taxa; 

        return total;
    }
}
