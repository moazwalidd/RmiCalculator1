package rmi.calc;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost:6000/CalculatorService";
            Calculator calc = (Calculator) Naming.lookup(url);

            int sum = calc.add(5, 3);
            int diff = calc.subtract(10, 4);

            System.out.println("Client --> 5 + 3 = " + sum);
            System.out.println("Client --> 10 - 4 = " + diff);
        } catch (Exception e) {
            System.err.println("Client exception: " + e);
            e.printStackTrace();
        }
    }
}
