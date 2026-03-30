import org.junit.runner.RunWith
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions



@RunWith(Cucumber.class)
@CucumberOptions(
features = "Include/features/Demo",
glue = "",
plugin = [
	"pretty",
	"html:Reports/ReportCucumber.html",
	"json:Reports/cucumber.json"
])
class CucumberRunner {
}