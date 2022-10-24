import flyweight.dto.ComidaDTO;
import flyweight.factory.ComidaFactory;

public class Main {
    public static void main(String[] args) {

        final ComidaFactory comida = new ComidaFactory();

        ComidaDTO pastaVerdura = comida.getComida("Pastas");
        pastaVerdura.setPrecio(10000);

        final ComidaDTO pastaCarne = comida.getComida("Pastas");
        System.out.println(pastaCarne.toString());

    }
}