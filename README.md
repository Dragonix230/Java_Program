# Java Programs

## 1. Program to Enter the Access Code and Check Whether the Door is Open or Not (`AccessCode.java`)

This Java program checks if a user-entered access code matches a predefined code (`1234`) to determine whether the door is open or closed.

### Code Details:
1. **Scanner Class**: Used to take user input from the console.
2. **Access Code**: The program prompts the user to enter a numeric code.
3. **Logic**:
   - If the entered code equals `1234`, the program prints "Door is open."
   - Otherwise, it prints "Door is closed."
4. **File Name**: 
   - The file must be saved as `AccessCode.java` since the class name in the program is `AccessCode`.

---

## 2. Program to Check Voting Eligibility (`VotingEligibility.java`)

This Java program determines whether a user is eligible to vote based on their age.

### Code Details:
1. **Scanner Class**: Used to read user input from the console.
2. **Input**: The program asks the user to enter their age.
3. **Logic**:
   - If the age is **18 or more**, the program prints "You are eligible to vote."
   - If the age is **less than 18**, it prints "You are not eligible to vote."
4. **File Name**: 
   - The file must be saved as `VotingEligibility.java` since the class name in the program is `VotingEligibility`.

---

## 3. Program to Check if a Number is Positive, Negative, or Zero (`NumberCheck.java`)

This Java program takes a user-entered number and determines whether it is positive, negative, or zero, with added input validation.

### Code Details:
1. **Scanner Class**: Used to take user input from the console.
2. **Input Validation**: 
   - The program uses `sc.hasNextInt()` to ensure the input is a valid integer.
   - If the input is invalid, it prints "Invalid input. Please enter a valid integer."
3. **Logic**:
   - If the number is **greater than 0**, it prints "The number is positive."
   - If the number is **less than 0**, it prints "The number is negative."
   - If the number is **0**, it prints "The number is zero."
4. **File Name**: 
   - The file must be saved as `NumberCheck.java` since the class name in the program is `NumberCheck`.

---

## 4. Program to Assign Grades Based on Marks (`GradeChecker.java`)

This Java program assigns grades to students based on the marks they enter, ensuring that the input is valid.

### Code Details:
1. **Scanner Class**: Used to take input (marks) from the user.
2. **Input Validation**: 
   - The program ensures that the marks entered are within the range of 0 to 100.
   - If the marks are outside this range, it prints "Invalid marks entered."
3. **Grade Assignment**: 
   - **A** for marks **90 or above**.
   - **B** for marks **80-89**.
   - **C** for marks **70-79**.
   - **D** for marks **60-69**.
   - **F** for marks **below 60**.
4. **File Name**: 
   - The file must be saved as `GradeChecker.java` since the class name in the program is `GradeChecker`.

---

### Summary

These Java programs demonstrate fundamental concepts like input handling, conditional logic, and validation:
1. **AccessCode.java**: Verifies a predefined access code to open or close the door.
2. **VotingEligibility.java**: Checks if the user's age meets the minimum requirement for voting.
3. **NumberCheck.java**: Validates and identifies whether a number is positive, negative, or zero.
4. **GradeChecker.java**: Assigns grades to students based on marks entered, with proper input validation.
