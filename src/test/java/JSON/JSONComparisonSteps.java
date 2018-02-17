package JSON;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.skyscreamer.jsonassert.JSONAssert;

public class JSONComparisonSteps {
    public String storeJSONAsString(String filePath) throws Exception {
        byte[] encoded = Files.readAllBytes(Paths.get("src/test/resources/" + filePath));
        return new String(encoded);
    }

    public void compareJSONs(String JSONone, String JSONtwo, boolean isStrict) throws Exception {
        JSONAssert.assertEquals(JSONone, JSONtwo, isStrict);
    }
}
