package com.vendingmachine.states;

import com.vendingmachine.Coin;
import com.vendingmachine.State;
import com.vendingmachine.VendingMachine;

import java.util.List;

public class HasMoneyState extends State {

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in coin dispense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
     machine.setVendingMachineState(new SelectionState());
    }


    @Override
    public void insertCoin(VendingMachine machine,Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }
}
