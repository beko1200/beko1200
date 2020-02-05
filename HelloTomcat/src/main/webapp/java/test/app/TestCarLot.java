//package test.app;
//import org.junit.*;
//import static org.junit.Assert.*;
//
//import cardealership.Car;
//import cardealership.Offer;
//import personell.Employee;
//
//public class TestCarLot {
//	
//	@Test
//	public void testCarMethods() throws Throwable {
//	Car car = new Car(1,(short) 1992,"ford","mustang",1000.00);
//	assertEquals(car.getCarId(), 1);
//	
//	assertEquals(car.getYear(), (short) 1992);
//	assertEquals(car.getMake(), "ford");
//	assertEquals(car.getModel(), "mustang");
//	}
//	
//	
//	@Test
//	public void testOfferMethods() throws Throwable {
//		
//	
//	Offer offer = new Offer(0, "user1", "1234", 2.00, "good");
//	assertEquals(offer.getUsername(), "user1");
//	assertEquals(offer.getVIN(),"1234");
//	assertEquals(offer.getStatus(),"good");
//	
//	}
//	
//	//  public Employee(long employeeId, String userName, String password, String fName, String lName) {
//	
//	public void testEmployeeMethods() throws Throwable {
//		
//		
//		Employee emp = new Employee("user1", "password", "first_name", "last_name");
//		assertEquals(emp.getUserName(), "user1");
//		assertEquals(emp.getPassword(), "password");
//		assertEquals(emp.getfName(), "first_name");
//		assertEquals(emp.getlName(), "last_name");
//		
//		
//		}
//	
//}
