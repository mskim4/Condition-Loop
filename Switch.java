public class Switch {
	public static void main(String[] args) {
		int n = 6;
		switch (n % 3) {
		case 0:
			System.out.printf("3의 배수입니다.\n");
			break;
		case 1:
		case 2:
			System.out.printf("3의 배수가 아닙니다.\n");
			break;
		}

		int x = 20;
		switch (x > 0 ? 1 : -1) {
		case 1:
			System.out.printf("양수\n");
			break;
		case -1:
			System.out.printf("음수 또는 0\n");
		}

		int op = 2, m = 1;
		switch (op) {
		case 1:
			m++;
			break;
		case 2:
			m++;
		case 3:
			m++;
		case 4:
			m++;
		}
		System.out.println(m);

		int score = 99;
		char grade;
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';

		}
		System.out.println(grade);
		
	}
}
