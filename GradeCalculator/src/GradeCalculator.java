import java.util.Scanner;

public class GradeCalculator{
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = input.nextLine();

        int[] marks = new int[5];
        String[] subjects = {"Maths ","Physics ", "English ","Kannada ","Hindi "};
        int total = 0;

        for(int i = 0; i<5; i++){
            System.out.print("Enter marks for " + subjects[i] + "(out of 100 )");
            marks[i] = input.nextInt();

            while (marks[i] < 0 || marks[i] > 100){
                System.out.println("Invalid marks. Enter again for" + subjects[i] + ":");
                marks[i] = input.nextInt();
            }
            total += marks[i];
        }
        double percentage = total / 5.0;
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60 ) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        }else {
            grade = "F";
        }
        System.out.println("\n---- Grade Report ----");
        System.out.println("Student:"+ name);
        System.out.println("total Marks: "+ total + "/ 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: "+grade);

        input.close();
    }
}