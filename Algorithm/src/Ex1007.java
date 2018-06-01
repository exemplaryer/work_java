import java.util.Scanner;

/*
 * 1007 : 달력
 * 
 * 원하는 년, 월, 일을 입력받아 해당 년, 월의 달력과 해당일의 요일을 출력하는 프로그램을 작성하시오.
 * 
 * ※ 윤년과 평년을 구별하는 방법은 다음과 같다. (윤년은 2월이 29일까지이다.)
 * 1) 400의 배수는 모두 윤년이다.
 * 2) 4의 배수이며 100의 배수가 아니면 윤년이다.
 * 3) 나머지는 모두 평년이다.
 * 
 * ※ 요일은 영어로 아래와 같다.
 * 일요일 Sunday 
 * 월요일 Monday 
 * 화요일 Tuesday 
 * 수요일 Wednesday 
 * 목요일 Thursday 
 * 금요일 Friday 
 * 토요일 Saturday
 * 
 * 입력 형식: 해당하는 년 y(y 는 2,000 이상 2,010 이하의 정수), 월 m(m은 1부터 12사이의 정수), 일 d(d는 해당 월 사이의 수)을 
 * 공백으로 구분하여 입력받는다.
 * 하나의 결과가 출력되면 프로그램을 종료한다.
 * 데이터의 크기가 주어진 범위를 벗어날 경우는 "INPUT ERROR!"를 출력하고 다시 입력받는다.
 * 
 * 출력 형식: 해당 년 월의 달력을 출력하고 해당 날짜의 요일을 출력한다.
 * 달력의 가장 왼쪽은 일요일이다.
 * 요일은 공백으로 구분하여 출력한다.
 * 날짜는 아래 출력 예와 같이 자리수를 맞추어 출력해야 한다.(요일과 요일사이 공백 날짜는 요일의 마지막글자에 맞춘다.)
 * 날짜를 계산할 때에는 윤년도 고려하여야 한다.
 * 2000년 1월 1일은 토요일이다.
 * 
 * 입력 예:
 * 2000 2 30 
 * 2000 10 22
 * 
 * 출력 예:
 * INPUT ERROR!
 * 2000. 10
 * sun mon tue wed thu fri sat
 *   1   2   3   4   5   6   7  
 *   8   9  10  11  12  13  14 
 *  15  16  17  18  19  20  21 
 *  22  23  24  25  26  27  28
 *  29  30  31
 * Sunday
 */
public class Ex1007 {
	private static final int[] MAX_DAY = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final String[] DAY_OF_WEEK = {null, "Sunday", "Monday", "Tuesday", "Wednesday", 
			"Thursday", "Friday", "Saturday"};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] date = scanner.nextLine().split(" ");
		int y = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int d = Integer.parseInt(date[2]);

		if (!(2000 <= y && y <= 2010)) {
			System.out.println("INPUT ERROR!");
			return;
		}
		else if (!(1 <= m && m <= 12)) {
			System.out.println("INPUT ERROR!");
			return;
		}
		else if (!(1 <= d && d <= getMaxDay(y, m))) {
			System.out.println("INPUT ERROR!");
			return;
		}
		int dayOfWeek = getDayOfWeek(y, m, 1);	// 해당 년, 월의 1일에 해당하는 요일 구하기

		
		int col = dayOfWeek;
		int endDate = getMaxDay(y, m);
		
		System.out.printf("%d. %d%n", y, m);
		System.out.println("sun mon tue wed thu fri sat");
		
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%3s ", " ");
		}
		
		// 1부터 마지막 날까지 달력에 출력하기
		for (int i = 1; i <= endDate; i++, col++) {
			System.out.printf("%3d ", i);
			if (col % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();	// 줄바꿈
		
		// 요일 출력하기
		System.out.println(DAY_OF_WEEK[getDayOfWeek(y, m, d)]);
	}

	// 해당 년, 월의 마지막 일을 리턴
	private static int getMaxDay(int year, int month) {
		boolean isLeapYear = false;
		
		boolean cond01 = year % 4 == 0;
		boolean cond02 = year % 100 != 0;
		boolean cond03 = year % 400 == 0;
		
		if (cond01 && cond02 || cond03) {
			isLeapYear = true;
		}

		int result = month == 2 && isLeapYear ? MAX_DAY[month] + 1 : MAX_DAY[month];
		return result;
	}

	// 해당 년, 월, 일이 2000년 1월 1일 기준으로 일주일에서 몇번째 날인지 리턴
	private static int getSumOfDay(int year, int month, int day) {
		int sumOfDay = 0;
		
		for (int i = 2000; i < year; i++) {
			for (int j = 1; j <= 12; j++) {
				sumOfDay += getMaxDay(i, j);
			}
		}
		
		for (int j = 1; j < month; j++) {
			sumOfDay += getMaxDay(year, j);
		}
		
		sumOfDay += day;
		return sumOfDay;
	}

	// 요일의 인덱스를 리턴(일요일 1, 월요일 2 순으로 ...)
	private static int getDayOfWeek(int year, int month, int day) {
		int sumOfDay = getSumOfDay(year, month, day);
		int index = sumOfDay % 7;
		index = (index + 5) % 7 + 1;	// 일요일부터 1으로 맞추기 위해

		return index;
	}
}
