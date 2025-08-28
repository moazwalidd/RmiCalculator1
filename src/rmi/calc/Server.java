package rmi.calc;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(6000);

            Calculator calc = new CalculatorImpl();
            String url = "rmi://localhost:6000/CalculatorService";
            Naming.rebind(url, calc);

            System.out.println("Server --> Calculator Service bound.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e);
            e.printStackTrace();
        }
    }
}
