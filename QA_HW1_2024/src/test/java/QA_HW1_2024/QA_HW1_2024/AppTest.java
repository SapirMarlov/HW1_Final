package QA_HW1_2024.QA_HW1_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;




/*
 * STUDENT NAME :
 * 	SAPIR MARLOV 207179169 AND Arkadi vorontsov 319257572
 */
/**
 * Unit test for simple App.
 */
public class AppTest {
	Q4 tester = new Q4 (); // object class test
    /**
     * Rigorous Test :-)
     */
	
	    @Test
	 // get an positive
	    public void Test_1 () {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = 5;
	    	int b = 3;
	    	String mod = "regular";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	
	    @Test
	    // get an positive 
	    public void Test_2 () {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = -2;
	    	int b = -7;
	    	String mod = "regular";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    // get an positive 
	    public void Test_3 () {
	    	String ExpectedResult = "B"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = 28;
	    	int b = -28;
	    	String mod = "negatives";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    @Test
	    // get an negative 
	    public void Test_4 () {
	    	String ExpectedResult = "Error"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = -5;
	    	int b = -5;
	    	String mod = "negatives";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    // get an positive 
	    public void Test_5() {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a = 0.2;
	    	double b = 0.5;
	    	String mod = "reciprocals";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    // get an Negative
	    public void Test_6() {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a = 0.2;
	    	int b = 10;
	    	String mod = "reciprocals";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    
	    @Test
	    // get an Negative
	    public void Test_7() {
	    	String ExpectedResult = "ERROR"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a = 1/5;
	    	double b = 1/0;
	    	String mod = "reciprocals";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    
	  
	    
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
