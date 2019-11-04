package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class Pizzeria {
	private Cuoco cuoco;
	
	  public void setPizzaBuilder(Cuoco pb)
	    {
	        cuoco = pb; 
	    }
	    public Pizza getPizza()
	    { 
	        return cuoco.getPizza(); 
	    }
	    
	    public Pizzeria constructPizza()
	    {
	        cuoco.createNewPizzaProduct();
	        cuoco.buildDough();
	        cuoco.buildSauce();
	        cuoco.buildTopping();
	        return this;
	    }
}
