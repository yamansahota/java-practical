// Employee.java
package employee;

public class Emp {
    String name;
    int empid;
    String category;
    double bpay;
    double hra;
    double da;
    double npay;
    double pf;
    double grosspay;
    double incometax;
    double allowance;

    public void setData(String name, int empid, String category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }

    public void calculateHRA() {
        if (bpay <= 20000) {
            hra = bpay * 0.15;
        } else if (bpay <= 50000) {
            hra = bpay * 0.1;
        } else {
            hra = 5000;
        }
    }

    public void calculateDA() {
        if (bpay <= 20000) {
            da = bpay * 0.8;
        } else if (bpay <= 50000) {
            da = bpay * 0.7;
        } else {
            da = bpay * 0.65;
        }
    }

    public void calculateNP() {
        npay = bpay * 0.12;
    }

    public void calculatePF() {
        pf = bpay * 0.12;
    }

    public void calculateGrossPay() {
        grosspay = bpay + hra + da + npay;
    }

    public void calculateIncomeTax() {
        if (bpay <= 20000) {
            incometax = bpay * 0.05;
        } else if (bpay <= 50000) {
            incometax = bpay * 0.15;
        } else {
            incometax = bpay * 0.25;
        }
    }

    public void calculateAllowance() {
        allowance = grosspay * 0.1;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("BPay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("NetPay: " + npay);
        System.out.println("PF: " + pf);
        System.out.println("GrossPay: " + grosspay);
        System.out.println("IncomeTax: " + incometax);
        System.out.println("Allowance: " + allowance);
    }
}