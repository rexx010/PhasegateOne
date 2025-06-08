import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentrualAppFunctionTest{

	@Test
	public void startCycleFunctionExist(){
	int number = 1, num2 = 2, num3 = 3;
	MentrualAppFunction.begin(number, num2, num3);
}

	@Test
	public void startCycleFunctionReturnsCorrectOutput(){
	int number = 2025, num2 = 8, num3 = 13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Your cycle starts on the 2025-08-13";
	assertEquals(expected, output);
}

	@Test
	public void startCycleFunctionDontAcceptNegativeValue(){
	int number = -2025, num2 = -8, num3 = -13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Invalid input";
	assertEquals(expected, output);
}


	@Test
	public void checkForYearValueIsNotMoreThan5OrLessThan4(){
	int number = 20255, num2 = 0, num3 = 13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Year can't have more than 5 digits";
	assertEquals(expected, output);
}

	@Test
	public void checkForMonthValueIsNotMoreThan12OrLessThan1(){
	int number = 2025, num2 = 13, num3 = 13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Months can't have more than 12";
	assertEquals(expected, output);
}

	@Test
	public void checkForDaysValueIsNotMoreThan12OrLessThan1(){
	int number = 2025, num2 = 12, num3 = 35;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Days can't have more than 30 or 31";
	assertEquals(expected, output);
}


	@Test
	public void endCycleFunctionExist(){
	int number = 1, num2 = 2, num3 = 3, days = 28;
	MentrualAppFunction.finish(number, num2, num3, days);
}

	@Test
	public void endCycleIsAccurate(){
	int number = 2025, num2 = 12, num3 = 3, days = 28;
	String output = MentrualAppFunction.finish(number, num2, num3, days);
	String expected = "Your cycle ends on the 2025-12-31";
	assertEquals(expected, output);
}

	@Test
	public void flowCycleFunctionWorks(){
	int number = 2025, num2 = 12, num3 = 3;
	MentrualAppFunction.flowDate(number, num2, num3);
}

	@Test
	public void flowCycleIsAccurate(){
	int number = 2025, num2 = 12, num3 = 3;
	String output = MentrualAppFunction.flowDate(number, num2, num3);
	String expected = "your flow starts on 2025-12-03 it ends on 2025-12-08";
	assertEquals(expected, output);
}


	@Test
	public void ovulationPeriodFunctionWorks(){
	int number = 2025, num2 = 12, num3 = 3, days = 28;
	MentrualAppFunction.ovulation(number, num2, num3, days);
}

	@Test
	public void ovulationPeriodIsAccurate(){
	int number = 2025, num2 = 12, num3 = 3, days = 28;
	String output = MentrualAppFunction.ovulation(number, num2, num3, days);
	String expected = "your ovulation starts on 2025-12-15 it ends on 2025-12-19";
	assertEquals(expected, output);
}

	@Test
	public void fertileLengthPeriodFunctionWorks(){
	int number = 2025, num2 = 12, num3 = 3, days = 28;
	MentrualAppFunction.fertileLength(number, num2, num3, days);
}

	@Test
	public void fertileLengthPeriodIsAccurate(){
	int number = 2025, num2 = 11, num3 = 3, days = 28;
	String output = MentrualAppFunction.fertileLength(number, num2, num3, days);
	String expected = "your fertility starts on the 2025-11-10 it ends on the 2025-11-19";
	assertEquals(expected, output);
}

	@Test
	public void safeperiodFunctionWorks(){
	int number = 2025, num2 = 12, num3 = 3, days = 28;
	MentrualAppFunction.safeperiod(number, num2, num3, days);
}


	@Test
	public void safeperiodIsAccurate(){
	int number = 2025, num2 = 11, num3 = 3, days = 28;
	String output = MentrualAppFunction.safeperiod(number, num2, num3, days);
	String expected = "All days are safe to have fun excluding days within 2025-11-10 and 2025-11-19";
	assertEquals(expected, output);
}




}