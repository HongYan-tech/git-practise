package test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class calendar {
	public static void main(String[] args) { 
	
	// 現在の日付を取得。
	LocalDateTime today = LocalDateTime.now();
	
	// 3年後の今日の日付を取得。
	LocalDateTime newDay = today.plusYears(3);
	
	// 3年後の曜日を取得。
	DayOfWeek dayofweek = newDay.getDayOfWeek();
	System.out.println(dayofweek);		
	
 }

}
