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


## Test Cases

- A test case is a set of actions performed on a system to determine if it satisfies software requirements and functions correctly. 
- The purpose of a test case is to determine if different features within a system are performing as expected and to confirm that the system satisfies all related standards, guidelines and customer requirements. 
- The process of writing a test case can also help reveal errors or defects within the system.
- Test cases are typically written by members of the quality assurance (QA) team or the testing team and can be used as step-by-step instructions for each system test. 
- Testing begins once the development team has finished a system feature or set of features. 
- A sequence or collection of test cases is called a **test suite**.

### Benefits
- Guaranteed good test coverage.
- Reduced maintenance and software support costs.
- Reusable test cases.
- Confirmation that the software satisfies end-user requirements.
- Improved quality of software and user experience.
- Higher quality products lead to more satisfied customers.
- More satisfied customers will increase company profits.

### Test Cases

#### Book Issue
| SN | Test Cases | Expected Result | Test Result |
|---|---|---|---|
| | On Click of | | |
| 1. | Add Button | At first, user have to fill all fields with valid data, if the accession number book is already issued, then it will give proper message. | Successful |
| 2. | Delete button Button | This deletes the details of the book by using Register No. | Successful |
| 3. | Update Button | Modified records are updated in database. | Successful |
| 4. | Search Button | Displays the details of issued book. Otherwise give proper error message. | Successful |
| 5. | Clear Button | Clear all fields. | Successful |
| 6. | Exit Button | Exit from the application. | Successful |
| 7. | Print Button | Print the details of issued book. | Successful |
| 8. | Next Button | Next page is displayed. | Successful |

#### Book Return
| SN | Test Cases | Expected Result | Test Result |
|---|---|---|---|
| | On Click of | | |
| 1. | Add Button | At first, user have to fill all fields with valid data, if any error like entering text data instead of number or entering number instead of text is found, then it gives proper message, otherwise adds Return Record to the database. | Successful |
| 2. | Delete button Button | This deletes the details of the book by using Register No. | Successful |
| 3. | Update Button | Modified records are updated in database. | Successful |
| 4. | Search Button | Displays the details of issued book. Otherwise give proper error message. | Successful |
| 5. | Clear Button | Clear all fields. | Successful |
| 6. | Exit Button | Exit from the application. | Successful |
| 7. | Print Button | Print the details of returned book. | Successful |
| 8. | Next Button | Next page is displayed. | Successful |
