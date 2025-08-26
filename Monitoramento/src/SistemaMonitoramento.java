import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento {
    private List<Sensor> sensoresValidos;
    private List<ErroSensor> sensoresComErro;

    public SistemaMonitoramento() {
        this.sensoresValidos = new ArrayList<>();
        this.sensoresComErro = new ArrayList<>();
    }

    public void processarSensores(List<Sensor> sensor, List<List<Double>> dados) {
        for(int i = 0; i < sensor.size(); i++) {
            Sensor auxSensor = sensor.get(i);
            List<Double> leitura = dados.get(i);

            try {
                auxSensor.registrarLeituras(leitura);
                sensoresValidos.add(auxSensor);
            }
            catch (LeituraInvalidaException | IllegalArgumentException e) {
                sensoresComErro.add(new ErroSensor(auxSensor.getId()));
            }
        }
    }
}
