package com.vendingmachine.states;

import com.vendingmachine.Item;
import com.vendingmachine.State;
import com.vendingmachine.VendingMachine;

public class DispenseState extends State {

    public DispenseState(VendingMachine machine, int code) throws Exception {
        System.out.println("IN DISPENSE STATE");
        dispenseProduct(machine,code);
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item= machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }
}
