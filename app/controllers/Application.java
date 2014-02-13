package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.Burgers;
import java.util.*;

public class Application extends Controller {

	





	public static Result index() {
		return ok(index.render("")); // redirect page





	}

	public static Result submit() {
		String ingredients_burger[] = {"Fromage", "Tomate", "Salade", "Oignon", "steak", "Cornichon", "Sauce Blanche"};
    	Burgers bigmac = new Burgers("Bigmac", ingredients_burger);
		String toto;
       
		//Map<String, String[]> map = request().body().asFormUrlEncoded();

    	//String[] checkedVal = map.get("burger");

		String tab_ingredients[] = {"Fromage", "Tomate", "Salade", "Oignon", "steak", "Cornichon", "Sauce Blanche"};
    	if(tab_ingredients.length!=0)
    	{
	    	if(bigmac.compareIngredients(tab_ingredients))
	    	{
	    		toto="Félicitations, vous avez reconstitué le burger !";
	    	}
	    	else
	    	{
	    		toto="Retentez votre chance !";
	    	}
	    }
	    else
	    {
	    	toto="Vous n'avez rien coché!!!!!!";
	    }



	    return ok(index.render(toto)); // redirect page





	}



}
