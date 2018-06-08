package co.com.proyectobase.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/orange.feature"
				,tags= {"@tag"}
				,snippets= SnippetType.CAMELCASE)
public class RunnerTags {}
