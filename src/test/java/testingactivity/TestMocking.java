package testingactivity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(MockitoJUnitRunner.class)
public class TestMocking {

	@InjectMocks
	BillCalculator billCalc = new BillCalculator();
	
	@Mock
	IBill billService;
	
	@Test
	public void testCalculateArea() {
		when(billService.calculateBill(10, 15, 15, 10)).thenReturn(50.0);
		assertEquals(billCalc.calculateBill(10, 15, 15, 10), 50.0, 0.0);
	}
	
}
