package com.vendingmachine.states;

import com.vendingmachine.Coin;
import com.vendingmachine.Item;
import com.vendingmachine.State;
import com.vendingmachine.VendingMachine;

import java.util.List;

public class SelectionState extends State {

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {

        //1 get item of this code number
        Item item = machine.getInventory().getItem(codeNumber);

        //2 total amt paid by user
        int paidByUser=0;
        for(Coin coin:machine.getCoinList()){
            paidByUser= paidByUser+ coin.value;
        }

        //3.compare product price and amount paid by user
        if(paidByUser < item.getPrice()){
            System.out.println("Insufficeint amount");
            refundFullMoney(machine);
            throw new Exception("Insufficeint funds");
        }else if(paidByUser >= item.getPrice()){
            if(paidByUser>item.getPrice()){
                getChange(paidByUser -item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception{
        System.out.println("Returned the change in coin dispenser"+returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        System.out.println("Returned full amount back in coin dispense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }
}
