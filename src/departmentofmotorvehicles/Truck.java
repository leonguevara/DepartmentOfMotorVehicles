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
public class Truck extends Vehicle {
    private String anotherAttribute;
    
    public Truck(String serialNumber, double motor, double invoiceValue, double loadingCapacity, String anotherAttribute) {
        super(serialNumber, motor, invoiceValue, loadingCapacity);
        this.anotherAttribute = anotherAttribute;
    }
    
    // I'm assuming that the rate value is already between 0 and 1;
    @Override
    public double calculateFee(double rate) {
        return this.loadingCapacity * rate;
    }
}
