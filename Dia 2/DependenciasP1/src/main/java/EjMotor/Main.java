package EjMotor;

import com.example.DependenciasP1.DependenciasP1Application;
import org.springframework.boot.SpringApplication;

public class Main {

    public static void main(String[] args) {

        Motor motorgasolina = new MotorGasolina();
        Vehiculo miCarro = new Vehiculo(motorgasolina);

        miCarro.iniciar();

    }

}
