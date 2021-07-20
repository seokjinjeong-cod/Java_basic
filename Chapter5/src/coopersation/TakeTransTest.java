package coopersation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("james", 5000);
		Student studentT = new Student("Thomas", 10000);
		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("taxi");
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		Subway subwayGold = new Subway(1);
		Subway subwaySilver = new Subway(2);
		
		studentE.takeTaxi(taxi);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwaySilver);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus200.showBusInfo();
		
		subwaySilver.showSubwayInfo();
		
		taxi.showTaxiInfo();
	}

}
