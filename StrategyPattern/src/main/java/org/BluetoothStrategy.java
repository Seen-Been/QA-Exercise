package org;

public class BluetoothStrategy implements ConnectionStrategy
{
    //@Override
    public void connectTo(String phone)
    {
        System.out.println(String.format("Connecting with %s through Bluetooth...", phone));
        System.out.println("Bluetooth connected.");
    }
}