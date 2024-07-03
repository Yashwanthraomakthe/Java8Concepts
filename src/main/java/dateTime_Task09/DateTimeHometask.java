package dateTime_Task09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeHometask {

	public static void predicateGivenDateIsYesterday() {

		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);

		Predicate<LocalDate> isYesterday = date -> date.equals(yesterday);

		LocalDate dateToCheck = LocalDate.of(2024, 06, 11);
		boolean isYesterdayDate = isYesterday.test(dateToCheck);

		System.out.println("Is yesterday's date? " + isYesterdayDate);

	}

	public static void supplierToGetDateForNextThursday() {
		Supplier<LocalDate> getNextThursday = () -> {
			LocalDate today = LocalDate.now();
			LocalDate nextThursday = today;
			while (nextThursday.getDayOfWeek() != DayOfWeek.THURSDAY) {
				nextThursday = nextThursday.plusDays(1);
			}
			return nextThursday;
		};

		LocalDate nextThursdayDate = getNextThursday.get();
		System.out.println("Next Thursday's date: " + nextThursdayDate);

	}

	public static void supplierToGetCurrentTimeInEST() {
		Supplier<LocalTime> getCurrentTimeInEST = () -> LocalTime.now(ZoneId.of("America/New_York"));

		LocalTime currentTimeInEST = getCurrentTimeInEST.get();
		System.out.println("Current time in EST: " + currentTimeInEST);

	}

	public static void functionAgeCalculator() {
		 LocalDate currentDate = LocalDate.now();
		 LocalDate birthDate = LocalDate.of(1990, 5, 25);
		 int age =  Period.between(birthDate, currentDate).getYears();
		 System.out.println("Age: " + age);

	}

	public static void main(String[] args) {
		predicateGivenDateIsYesterday();
		supplierToGetDateForNextThursday();
		supplierToGetCurrentTimeInEST();
		functionAgeCalculator();

	}

}
