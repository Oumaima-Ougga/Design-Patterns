package Deco;

import composants.Boisson;

public class Vanille extends Decorateur{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+ 1.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " Vanille";
    }
}
