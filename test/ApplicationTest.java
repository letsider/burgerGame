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


    @Test
    public void testBurgerVide() 
    {

    	//test pour un burger vide
        Burgers bigmac = new Burgers();
        assertEmpty(bigmac);
    }

    @Test
    public void testBurger(){
        //test pour un burger avec des ingredients
        String tab_ingredients[] = {"fromage", "tomate"};
        Burgers cheese = new Burgers("cheeseburger", tab_ingredients);
        assertNbIngredients(cheese, 2);
    }



}
