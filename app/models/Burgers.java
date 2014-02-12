package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

import play.Logger;

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

    //méthode pour comparer 2 listes d'ingrédients
    public boolean compareIngredients(String[] tab1){
        int present = 0;//6
        int faux = 0;//1
        //pour chaque ingrédient du burger
        for(int i=0;i<tab1.length;i++){
            //si l'ingrédient est présent dans le tableau à comparer
            //if (this.ingredients.contains(tab1[i])){
            if (Arrays.asList(this.ingredients).contains(tab1[i]))
            {
                present++;
            }
            else{
                faux++;
            }
        }

        //quand on a fini de comparer les chaînes on regarde si les ingrédients propsé sont strictement les mêmes(nombres et valeurs)
        if (present == this.ingredients.length && faux==0){
            
            System.out.println("///////Félicitations, vous avez reconstitué le burger !");
            return true;
        }
        else{

            if(present<this.ingredients.length && faux==0)
            {

                System.out.println("////////Vous n'avez pas trouvé tout les ingrédients mais vous êtes sur la bonne voie!");
                return true;
            }
            else
            {
                System.out.println("///////Désolé vous n'avez pas trouvé tous les bons ingrédients, vous avez "+faux+" fautes!");
                return false;
            }


            
        }





    }
}

    