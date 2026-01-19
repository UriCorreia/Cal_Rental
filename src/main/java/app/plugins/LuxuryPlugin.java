package app.plugins;

import app.interfaces.IVehiclePlugin;
import java.math.BigDecimal;
import java.util.Map;

public class LuxuryPlugin implements IVehiclePlugin {

    @Override
    public String getVehicleType() {
        return "Luxury";
    }

    @Override
    public BigDecimal calculateTotal(int days, BigDecimal baseRate, Map<String, Double> fees) {

        BigDecimal total = baseRate.multiply(new BigDecimal(days));

        // 2. Adiciona TODAS as taxas que estiverem no Map
        if (fees != null) {
            for (Map.Entry<String, Double> taxa : fees.entrySet()) {
                // Converte o Double da taxa para BigDecimal e soma
                total = total.add(BigDecimal.valueOf(taxa.getValue()));
                System.out.println("   + Taxa de " + taxa.getKey() + ": R$ " + taxa.getValue());
            }
        }

        // 3. Adiciona uma taxa extra de 10% pelo serviço "Premium"
        total = total.multiply(new BigDecimal("1.10"));

        return total;
    }
}