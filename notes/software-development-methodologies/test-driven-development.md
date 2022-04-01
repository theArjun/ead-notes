---
title: Test Driven Development
description: Explains about Test Driven Development in brief.
---

> TDD = TFD + Refactoring, TFD = Test First Development 

## Introduction

It is a software development process that relies on the repetition of a very short development cycle. 

1. Requirements are turned into very specific test cases.
2. Then the software is improved to pass the new test only.
3. TDD is related to the test first programming concept of XP ( Extreme Programming ).

TDD Starts with development of test for each one of the feature.   
The test might fail as the test are developed even before the development.  
Development team then develops and refactors the code to pass the test.

## TDD Sequences

1. Add a test.
2. Run all tests and see if the new test fails.
3. Write the code that causes the test to pass.
4. Run tests.
5. Refactor code.
6. Continue process from step 1 to 5.

![TDD Diagram](../assets/images/tdd.png)

## Benefits of TDD
1. The software design becomes modular.
2. The code is easier to maintain.
3. Code refactoring goes more smoothly.
4. Project costs decrease, ROI increases.
5. TDD documents the code better.
6. Developers have less debugging to do.
7. Shorter development cycle.
8. Near 0 (zero) Defects.
9. Test becomes safety net.
10. Code proven to meet requirements.

## Cons of TDD
1. Slows down the development process.
2. TDD Approach is difficult to learn relatively.
3. It is an "All or None" approach.
4. It is challenging to support and maintain.


## Example of TDD
Suppose we are going to develop a calculator which perfroms addition.


### Python
1. First we need to develop a test for addition.
   
    ```python
    import unittest

    class TestCalculator(unittest.TestCase):
            def test_addition(self):
                result = Calculator.add(2, 2)
                self.assertEqual(result, 4)
    ```
2. Run the test and see the failed test.
   
    ```shell
    python -m unittest test_calculator.py
    ```

3. The test case failed, now write the code that will make the test pass.
   
    ```python
    class Calculator:
        @staticmethod
        def add(a, b):
            return a + b
    ```

4. Run the test again and see if the test passes.
    ```shell
    python -m unittest test_calculator.py
    ```
5. The test passes, now refactor the code if needed.
   
    ```python
    class Calculator:
        @staticmethod
        def add(a, b):
            return a + b
    ```
6. Run the test again and see if the test passes.
    ```shell
    python -m unittest test_calculator.py
    ```
7. The test passes, now continue the process.

### Java
1. First we need to develop a test for addition.
   
    ```java
    import org.junit.Test;
    import static org.junit.Assert.*;

    public class StudentTest {

        @Test
        public void testDisplayStudentName() {
            Student student = new Student();
            String studentName = student.displayStudentName("Arjun", "Adhikari");
            assertEquals("Arjun Adhikari", studentName);
        }
    }
    ```

2. Run the test and see the failed test.
   
    ```shell
    mvn test
    ```

3. The test case failed, now write the code that will make the test pass.
   
    ```java
    public class Student {

        public String displayStudentName(String firstName, String lastName) {
            return firstName + " " + lastName;
        }
    }
    ```

4. Run the test again and see if the test passes.
    ```shell
    mvn test
    ```

5. The test passes, now refactor the code if needed.
   
    ```java
    public class Student {

        public String displayStudentName(String firstName, String lastName) {
            return firstName + " " + lastName;
        }
    }
    ```

6. Run the test again and see if the test passes.
    ```shell
    mvn test
    ```

7. The test passes, now continue the process.
