import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
	void setUp() {
		println("SETUP SCENARIO CUCUMBER")
	}

    @After
	void tearDown() {
		println "TEAR DOWN SCENARIO CUCUMBER"
	}
}