package Tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * AllTests.java
 * 
 * Runs all unit tests at once.
 * 
 * @author Daniel Tranfaglia
 */

@RunWith(Suite.class)
@SuiteClasses({ CustomMapInsertTests.class, HealthBarTests.class, MapTests.class, PlayerTest.class, PokemonTests.class, ItemTests.class })
public class AllTests {

}