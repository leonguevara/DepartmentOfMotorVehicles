/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentofmotorvehicles;

/**
 *
 * @author leonguevara
 */
public class Vehicle {
    String serialNumber;
    double motor;
    double invoiceValue;
    double loadingCapacity;
    
    Vehicle(String serialNumber, double motor, double invoiceValue, double loadingCapacity) {
        this.serialNumber = serialNumber;
        this.motor = motor;
        this.invoiceValue = invoiceValue;
        this.loadingCapacity = loadingCapacity;
    }
    
    public double calculateFee(double rate) {
        return 1000 * rate;
    }
}
