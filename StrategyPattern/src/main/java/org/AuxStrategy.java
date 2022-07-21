package org;

public class AuxStrategy implements ConnectionStrategy
{
    //@Override
    public void connectTo(String phone)
    {
        System.out.println(String.format("Connecting with %s via aux cable...", phone));
        System.out.println("Aux connected.");
    }
}