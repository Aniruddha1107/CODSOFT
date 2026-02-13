import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentGradeCalculator {
    Scanner sc=new Scanner(System.in);
    int[] marks;
    int totalMarks=0;
    double avgPercentage=0;
    char grade;
    //Accepting Marks from User
    public void assignMarks(int n){
        marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for subject "+(i+1)+":");
            try{
                int input=sc.nextInt();
                if(input>=0 && input<=100){
                    marks[i]=input;
                }else{
                    System.out.println("Please Enter a Valid Integer between 0 and 100");
                    i--; 
                }
            }catch(InputMismatchException e){
                System.out.println("Please Enter a Valid Integer");
                i--; 
            }
        }
    }
    //Performing calculation of Total Marks and Average Percentage
    public void calculateMarks(){
        for(int i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }
        avgPercentage=(double)totalMarks/marks.length;
    }
    //Assigning Grade based on Average Percentage
    public void assignGrade(){
        boolean hasFailed=false;
        for(int m:marks){
            if(m<40){
                hasFailed=true;
                break;
            }
        }
        if(hasFailed){
            grade='F';
        }else if(avgPercentage>=90){
            grade='A';
        }else if(avgPercentage>=80){
            grade='B';
        }else if(avgPercentage>=70){
            grade='C';
        }else if(avgPercentage>=60){
            grade='D';
        }else{
            grade='F';
        }
    }
    //Displaying The Results
    public void displayResults(){
        System.out.println("----Result----");
        System.out.println("Total Marks: "+totalMarks +"/"+(marks.length*100));
        System.out.println("Average Percentage: "+String.format("%.2f", avgPercentage)+"%");
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args){
        StudentGradeCalculator obj=new StudentGradeCalculator();
        int n=0;
        System.out.println("Enter the number of subjects:");
        try{
            n=obj.sc.nextInt();
            if(n<=0){
                System.out.println("Please enter a valid number of subjects greater than 0.");
                obj.sc.next();
                main(args); 
                return; 
            }
        }catch(InputMismatchException e){
            System.out.println("Please Enter a Valid Integer");
            obj.sc.next();
        }
        
        obj.assignMarks(n);
        obj.calculateMarks();
        obj.assignGrade();
        obj.displayResults();
    }
}
