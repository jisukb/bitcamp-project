package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    Scanner keyboard = new Scanner(System.in);

    System.out.print("번호? ");
    int number = keyboard.nextInt();
    keyboard.nextLine(); // 번호 뒤에 남아 있는 줄바꿈 코드를 제거

    System.out.print("프로젝트명? ");
    String title = keyboard.nextLine();

    System.out.print("내용? ");
    String content = keyboard.nextLine();

    System.out.print("시작일? ");
    Date start = Date.valueOf(keyboard.nextLine());

    System.out.print("종료일? ");
    Date end = Date.valueOf(keyboard.nextLine());

    System.out.print("만든이? ");
    String name = keyboard.nextLine();

    System.out.print("팀원? ");
    String members = keyboard.nextLine();

    keyboard.close();

    System.out.println("------------------------------");

    System.out.printf("번호: %d\n", number);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", start);
    System.out.printf("종료일: %s\n", end);
    System.out.printf("만든이: %s\n", name);
    System.out.printf("팀원: %s\n", members);
  }
}
