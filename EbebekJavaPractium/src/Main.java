import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen Ad ve Soyad giriniz : ");
		String name = input.nextLine();

		System.out.print("Lütfen maaşınızı giriniz : ");
		double salary = input.nextDouble();

		System.out.print("Lütfen haftalık çalışma saatinizi giriniz : ");
		double workHours = input.nextDouble();

		System.out.print("Lütfen işe giriş yılınızı giriniz : ");
		int hireYear = input.nextInt();
		
		
		Employee employee = new Employee(name,salary,workHours,hireYear);
		
		
		System.out.println(employee.toString());
		
	}

}
