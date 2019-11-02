package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public abstract class Pizza implements Cloneable {
	@Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
