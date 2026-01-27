package oops.collframe;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		DateTimeFormatter newformat = DateTimeFormatter.ofPattern("dd--MM--yyyy HH:mm:ss");
		String formatted = dateTime.format(newformat);
		System.out.println(formatted);
		System.out.println("----------------------------");
		
		Currency currency = Currency.getInstance("USD");
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());
		
		System.out.println("----------------------------");

		
		Currency currency2 = Currency.getInstance("INR");
		System.out.println(currency2.getCurrencyCode());
		System.out.println(currency2.getSymbol());
		System.out.println(currency2.getDisplayName());
		
		System.out.println("----------------------------");

		
		double amount = 123456.789;
		
		@SuppressWarnings("deprecation")
		NumberFormat indiaformat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		System.out.println(indiaformat.format(amount));
		
		NumberFormat usaformat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(usaformat.format(amount));
		
		NumberFormat japanformat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(japanformat.format(amount));
	}
}
