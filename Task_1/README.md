# Number Guessing Game 🎲
**Task 1 - CodSoft Java Programming Internship**

## 📝 Description
This is a Java console application developed as part of the CodSoft internship. The program generates a random number between 1 and 100, and the user must guess it within a limited number of attempts. It provides feedback on whether the guess is too high or too low, helping the user narrow down the correct number.

## ✨ Key Features
* [cite_start]**Random Number Generation:** The system picks a random number within the range of 1 to 100[cite: 62].
* [cite_start]**Feedback Mechanism:** Tells the user if their guess is "Too High" or "Too Low" to guide them[cite: 64].
* [cite_start]**Attempt Limiting:** Restricts the user to a set number of attempts (e.g., 5 or 10) to make the game challenging[cite: 67].
* [cite_start]**Score Calculation:** Displays a score based on the number of attempts taken to guess correctly[cite: 69].
* [cite_start]**Replayability:** Allows the user to play multiple rounds without restarting the program[cite: 68].

## 🛠️ Tech Stack
* **Language:** Java
* **Core Logic:** `java.util.Random` for number generation, `java.util.Scanner` for user input.
* **Concepts:** Loops (`while`, `for`), Conditionals (`if-else`), Exception Handling.

## 🚀 How to Run
1.  **Compile the code:**
    Open your terminal or command prompt in the project folder and run:
    ```bash
    javac NumberGame.java
    ```
2.  **Run the application:**
    ```bash
    java NumberGame
    ```

## 📋 Example Usage
```text
--- Welcome to the Number Guessing Game ---

I have picked a number between 1 and 100.
You have 5 attempts to guess it!

Enter your guess: 50
Too High! Try lower.

Enter your guess: 25
Too Low! Try higher.

Enter your guess: 37
Congrats! You guessed the right number.

Current Score: 1
Do you want to play again? (1 for Yes / 0 for No): 0

Thanks for playing!
