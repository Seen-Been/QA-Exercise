package org;

public class StrategySwapper
{
	ConnectionStrategy strategy;

    public void setStrategy(ConnectionStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void connect(String phoneName)
    {
        strategy.connectTo(phoneName);
    }
}
