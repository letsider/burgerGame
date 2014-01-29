package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Ingredients {
    @Required
    public String nom;


    public Ingredients() {}
    public Ingredients(String n) 
    {
		this.nom = n;
    }


    public String getNom()
    {
    	return this.nom;
    }
