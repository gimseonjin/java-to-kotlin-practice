package ch1;

import java.util.Arrays;
import java.util.List;

public class practice1 {
    public static void main(String args[]){
        int a = 5;
        int b = 24;

        String result = "TUE";
        String answer = solution(a,b);

        System.out.println(result.equals(answer));

    }

    public static String solution(int a, int b) {
        // 1. week_list = [] <- 인덱스로 찾아가게끔
        List<String> weekList = Arrays.asList("FRI","SAT","SUN","MON","TUE","WED","THU");
        // 2. month_list = [] < 1~12월까지의 날짜를 넣을 것이다.
        List<Integer> monthList = Arrays.asList(0,31,29,31,30,31,30,31,31,30,31,30,31);

        int totalDate = getTotalDate(monthList, a, b);

        String week = getWeek(weekList, totalDate);

        return week;
    }

    public static int getTotalDate(List<Integer> monthList, int a, int b){
        int dates = 0;

        for(int i = 1; i < a; i++){
            dates+=monthList.get(i);
        }

        dates += b-1;

        return dates;
    }

    public static String getWeek(List<String> weekList, int totalDate){
        return weekList.get(totalDate % 7);
    }
}
