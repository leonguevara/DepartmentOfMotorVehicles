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
public class Car extends Vehicle {
    private String brand;
    
    public Car(String serialNumber, double motor, double invoiceValue, double loadingCapacity, String brand) {
        super(serialNumber, motor, invoiceValue, loadingCapacity);
        this.brand = brand;
    }
    
    // I'm assuming that the rate is already a value between 0 and 1
    @Override
    public double calculateFee(double rate) {
        return this.invoiceValue * rate;
    }
}
