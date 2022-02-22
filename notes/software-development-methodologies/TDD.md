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

## TDD Sequuences

1. Add a test.
2. Run all tests and see if the new test fails.
3. Write the code that causes the test to pass.
4. Run tests.
5. Refactor code.
6. Continue process from step 1 to 5.

![TDD Diagram](../assets/images/tdd.png)

## Benefits of TDD
1. Much less debug time.
2. Code proven to meet requirements.
3. Test becomes safety net.
4. Near 0 (zero) Defects.
5. Shorter development cycle.
