package DesignPattern.Behavior.Strategy;

import Model.Plant.Plant;

public class Context{

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(Plant plant) {
        strategy.strategyInterface(plant);
    }

}