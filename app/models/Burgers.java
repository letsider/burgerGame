package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Burgers {
    @Required
    public String nom;
    public String ingredients[];


    public Burgers() 
    {
        this.nom="";
        this.ingredients= null;
    }
    
    public Burgers(String n, String[] i) 
    {
		this.nom = n;
		this.ingredients = i;
    }

    public String getNom()
    {
    	return this.nom;
    }

    public String[] getIngredients()
    {
    	return this.ingredients;
    }

    public boolean empty()
    {
        if(this.ingredients==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //retourne le nombre d'ingredients
    public int nb_ingredients(){
        return this.ingredients.length;
    }

    //test si un ingrédients est dans le burger
    public boolean isPresent(String ing)
    {
        boolean present=false;
        for(int i=0;i<this.ingredients.length;i++)
        {
            if(this.ingredients[i]==ing)
            {
                present=true;
            }
        }
        return present;
    }
}

    