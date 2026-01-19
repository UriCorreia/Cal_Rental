package app.plugins;

import Interface.IVehiclePlugin;
import java.math.BigDecimal;
import java.util.map;

public class EconomyPlugin implements IVehiclePlugin {

    @Override
    public String getVehicleType() {
        return "Economic";
    }

    @Override
    public BigDecimal calculateTotal(int days, BigDecimal baseRate, Map<String, Double> fees) {

        BigDecimal total = baseRate.multiply(new BigDecimal(days));

        // 2. Adicionar taxas extras (Se houver "seguro", adiciona. Ignora taxas VIP)
        if (fees != null) {
            if (fees.containsKey("secure")) {
                Double secureValue = fees.get("secure");
                total = total.add(BigDecimal.valueOf(secureValue));
            }
        }

        return total;
    }
}