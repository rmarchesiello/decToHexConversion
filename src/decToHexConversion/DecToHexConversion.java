package decToHexConversion;

import java.util.*;

public class DecToHexConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = 0;
		int originalNum = 0;
		List<Object> convertedValue = new ArrayList<Object>();
		
		System.out.print("Please enter a decimal number: ");
		value = input.nextInt();
		originalNum = value;
		
		while (value != 0) {
			if (value % 16 >= 0 && value % 16 < 10) {
				convertedValue.add(0, (value % 16));
			} else if (value % 16 == 10) {
				convertedValue.add(0, 'A');
			} else if (value % 16 == 11) {
				convertedValue.add(0, 'B');
			} else if (value % 16 == 12) {
				convertedValue.add(0, 'C');
			} else if (value % 16 == 13) {
				convertedValue.add(0, 'D');
			} else if (value % 16 == 14) {
				convertedValue.add(0, 'E');
			} else if (value % 16 == 15) {
				convertedValue.add(0, 'F');
			}
			
			value /= 16;
		}
		
		System.out.print("Decimal number " + originalNum + " converted to hex: ");		
		for (int i = 0; i < convertedValue.size(); i++) {
			System.out.print(convertedValue.get(i));
		}
		
		input.close();
	}
}