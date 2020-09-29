package student;

import java.util.Scanner;

public class StudentInterFace {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);

        String name;
        int score;

        while (true) {
            System.out.print("Enter name for first student (min 1 letter) > ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s ", i, stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i, score);
            }

            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                scan.nextLine();
                System.out.println("\n-----------------------\n");
            }
        }
        scan.nextLine();
        System.out.println("\n-----------------------\n");
        //Input the second students data
        //Input the first students data
        while (true) {
            System.out.print("Enter name for second student (min 1 letter) > ");
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s ", i, stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i, score);
            }

            String errormsg = stu2.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                scan.nextLine();
                System.out.println("\n-----------------------\n");
            }
        }
        System.out.println("\n-----------------------\n");
        System.out.format("%s\n", stu1);
        System.out.format("%s\n", stu2);
        System.out.println("\n-----------------------\n");
        if(stu1.getHighScore() >= stu2.getHighScore())
            System.out.format("%s had the higher score of %d\n", stu1.getName(), stu1.getHighScore());
        else
            System.out.format("%s had the higher score of %d\n", stu2.getName(), stu2.getHighScore());
        if(stu1.getAverage() >= stu2.getAverage())
            System.out.format("%s had the higher average of %d\n", stu1.getName(), stu1.getAverage());
        else
            System.out.format("%s had the higher average of %d", stu2.getName(), stu2.getAverage());
    }
}
