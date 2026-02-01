# Student Grade Calculator 📊
Task 2 - CodSoft Java Programming Internship

## 📝 Description
This is a Java console application developed as part of the CodSoft internship. It calculates a student's total marks, average percentage, and assigns a grade based on their performance in multiple subjects.

## ✨ Key Features
* Dynamic Input: Allows users to specify the number of subjects and enter marks for each.
* Input Validation: Ensures marks are within the valid range (0-100) and handles invalid non-integer inputs without crashing.
* Smart Grading:
    * Calculates total marks and average percentage.
    * Assigns grades (O, A, B, C, D, F) based on the calculated percentage.
    * Fail Detection: Automatically assigns an 'F' grade if the student scores below the passing threshold (e.g., < 40) in *any* single subject, regardless of the overall average.
* Formatted Output: Displays the average percentage rounded to two decimal places for clarity.

## 🛠️ Tech Stack
* Language: Java
* Input Handling: `java.util.Scanner`
* Exception Handling: `try-catch` blocks for robust error management.

##  How to Run
1.  Compile the code:
    Open your terminal or command prompt in the project folder and run:
    ```bash
    javac StudentGradeCalculator.java
    ```
2.  Run the application:
    ```bash
    java StudentGradeCalculator
    ```

## Example Usage
Enter the number of subjects:
3
Enter marks for subject 1:
85
Enter marks for subject 2:
92
Enter marks for subject 3:
78

----Result----
Total Marks: 255/300
Average Percentage: 85.00%
Grade: A
Result: PASS