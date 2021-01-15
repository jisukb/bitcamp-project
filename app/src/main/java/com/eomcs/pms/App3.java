package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner scanner = new Scanner(System.in);

    System.out.print("프로젝트? ");
    String project = scanner.nextLine();

    System.out.print("번호? ");
    int num = Integer.parseInt(scanner.nextLine());

    System.out.print("내용? ");
    String content = scanner.nextLine();

    System.out.print("완료일? ");
    Date end = Date.valueOf(scanner.nextLine());

    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(scanner.nextLine());

    System.out.print("담당자? ");
    String manager = scanner.nextLine();

    scanner.close();

    System.out.println("------------------------------------");
    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", num);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", end);

    switch (status) {
      case 1:
        System.out.println("상태: 진행중");
        break;
      case 2:
        System.out.println("상태: 완료");
        break;
      default:
        System.out.println("상태: 신규");
    }

    System.out.printf("담당자: %s\n", manager);
  }
}
