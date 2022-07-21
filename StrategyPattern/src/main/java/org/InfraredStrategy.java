package org;

public class InfraredStrategy implements ConnectionStrategy
{
    //@Override
    public void connectTo(String phone)
    {
        System.out.println(String.format("Connecting to %s via IR audio...", phone)); //example of formatted string
        System.out.println("IR audio connected.");
    }
}