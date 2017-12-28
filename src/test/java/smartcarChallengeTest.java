//
//	Acacia Hoisington	
//	12/23/17
//	Smartcar Coding Challenge
//	Test Class for smartcarChallenge file
//	
//  
//	

import org.junit.Assert;
import org.junit.Test;


public class smartcarChallengeTest {

    @Test
    public void vehicleTest() {

        String expectedJson = "{\n" + "  \"vin\": \"123123412412\",\n" +"  \"color\": \"Metallic Silver\",\n" +
                "  \"doorCount\": 4,\n" +"  \"driveTrain\": \"v8\"\n" +"}";
        Assert.assertEquals(expectedJson, smartcarChallenge.vehicle("1234"));
    }

}







