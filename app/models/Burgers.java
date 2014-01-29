package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Burgers {
    @Required
    public String nom;
    public Vector<Ingredients> ingredients;


    public Burgers() {}
    
    public Burgers(String n, Vector<Ingredients> i) 
    {
		this.nom = n;
		this.ingredients = i;
    }

    public String getNom()
    {
    	return this.nom;
    }

    public Vector<Ingredients> getIngredients()
    {
    	return this.ingredients;
    }

    