---
title: Software Testing
description: Explains about different software testing techniques.
---

Proces of evaluating a software system by manual or automated means to verify that it satisfies the specified requirements.

![Software Testing](../assets/images/testing-deliverables.svg)

## Why ?
1. To find errors.
2. To ensure that software delivered does not have defects.
3. Post removal of bugs is expensive.
4. Buggy software can be harmful to data, property and life.
5. To improve quality, thus having good business and trust.
6. To ensure all the product functionalities work as per the specification.

## How ?

### On basis of Resource Involved
1. Manual testing
2. Automated testing

### On basis of Orientation
1. Demonstration Oriented Testing - Optimisitic / Positive Approach
2. Destruction Oriented Testing - Pessimistic / Negative Approach
3. Debugging Oriented Testing - Debugging Approach

## Levels of Software Testing
1. Unit Testing
2. Component Testing
3. Integration Testing
4. System Testing
5. Acceptance Testing

## When ?
- Until `BUDGET`, `TIME` and `QUALITY` are satisfied.


## Principles - `[PATTEED]`
1. Testing Shows Presence of Bugs
    - Shows presence
    - Cannot prove absence
    - Helps to find undiscovered defects.
2. Exhaustive Testing is impossible
    - Impossible to test all possible input combinations.
    - Smarter way should be adopted.
3. Early Testing
    - Start as soon as possible.
    - finding defects early saves a lot of money than finding it later.
4. Defect Clustering
    - Equal distribution of bugs across the module is not possible.
    - Defect may be clustered in small peice of code/module.
5. Pesticide Paradox
    - Executing same tests again and again will not help to identify more bugs.
    - Review them regularly and modify if changes required.
6. Absence of Error Fallacy
    - Finding and fixing many bugs doesn't help.
    - If if doesnot meed users requirement, it is not useful.
7. Testing is Context Dependent
    - Different software are tested in different contexts.
    - Eg: Testing in a browser, testing in a server, testing in a mobile app.
    - Eg: Testing for a banking sofware is different from testing for a web application.
