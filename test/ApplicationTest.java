import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.Burgers;
import models.Ingredients;



/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    

    void assertEmpty(Burgers b)
    {
    	assertTrue(b.empty()==true);
    }

    void assertNbIngredients(Burgers b, int nbI)
    {
        assertThat(b.nb_ingredients()).isEqualTo(nbI);
    }

    void assertIngredient(Burgers b, String ing)
    {
        assertTrue(b.isPresent(ing)==true);
    }

    void assertIngredients(Burgers b, String[] ing)
    {
        assertTrue(b.compareIngredients(ing)==true);
    }


    @Test
    public void testBurgerVide() 
    {
    	//test pour un burger vide
        Burgers bigmac = new Burgers();
        assertEmpty(bigmac);
    }

    @Test
    public void testBurgerNbIngredients(){
        //test pour un burger avec des ingredients
        String tab_ingredients[] = {"fromage", "tomate"};
        Burgers cheese = new Burgers("cheeseburger", tab_ingredients);
        assertNbIngredients(cheese, 2);
    }

    @Test
    public void testBurgerIngredient(){
        //test pour un burger avec un ingredient précis
        String ingredient= "tomate";
        String tab_ingredients[] = {"fromage", "tomate"};
        Burgers cheese = new Burgers("cheeseburger", tab_ingredients);
        assertIngredient(cheese, ingredient);
    }

    @Test
    public void testBurgerIngredients(){
        //test pour un burger avec des ingrédients précis présents dans le burger
        String tab_ingredients[] = {"tomate", "fromage", "salade", "oignon", "steak", "cornichons"};
        String ingredients_burger[] = {"fromage", "tomate", "salade", "oignon", "steak", "cornichons"};
        Burgers bigmac = new Burgers("bigmac", ingredients_burger);
        assertIngredients(bigmac, tab_ingredients);
    }


}
