// Emppay.java
import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.setData("Yaman", 101, "General", 20000);
        e.calculateHRA();
        e.calculateDA();
        e.calculateNP();
        e.calculatePF();
        e.calculateGrossPay();
        e.calculateIncomeTax();
        e.calculateAllowance();
        e.printData();
    }
}