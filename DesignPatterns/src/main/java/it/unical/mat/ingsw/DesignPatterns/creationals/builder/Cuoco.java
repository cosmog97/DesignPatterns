package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

abstract class Cuoco {
    protected Pizza pizza;
    
    public Pizza getPizza()
    { 
        return pizza; 
    }
    public void createNewPizzaProduct()
    { 
        pizza = new Pizza(); 
    }
    
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
