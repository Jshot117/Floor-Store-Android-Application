# Test Plan

**Author**: Jonnathan Saavedra

## 1 Testing Strategy 
### 1.1 Overall Strategy
### Unit Testing:

**Purpose**: Test individual functions or actions of the software.  
**Activities**: Developers create and run tests for each small part.  
**Responsibility**: Dimitry and Jonn (Software developers) will handle unit testing.  

### Integration Testing:

**Purpose**: Test how the small parts work together.  
**Activities**: Developers or testers create and run tests to check if the parts interact correctly.  
**Responsibility**: GANGJUNJIANG (Project Manager and Testing) will lead integration testing. Dimitry and Jonn (Software developers) will also be involved.

### System Testing:
***Purpose***: Test the entire software application.  
***Activities***: Testers create and run tests to ensure the app meets requirements and works in its intended environment.  
***Responsibility***: GANGJUNJIANG (Project Manager and Testing) will be responsible for system testing.

### Regression Testing:

***Purpose***: Test the software after changes to ensure it still works correctly.
***Activities***: Testers run previously passed tests to verify the app still functions as expected after changes.
***Responsibility***: GANGJUNJIANG (Project Manager and Testing) will handle regression testing.

### 1.2 Test Selection 
For unit testing, we will use white-box testing techniques such as statement coverage to ensure that all parts of the code are thoroughly tested.  

For system testing, we will use   black-box testing techniques like use case testing to validate the software's functionality against its requirements.

For regression testing, we will use Black-box and White-box techniques like statement coverage and use case testing

## 1.3 Adequacy Criterion

To ensure a list of good quality test cases, we will select cases that cover every function in the application, ie every structure must execute at least once.

## 1.4 Bug Tracking 

We will use GitHubs built-in issue tracking system for logging, managing and resolving bugs.

## 1.5 Technology    
- JUnit   
- Robotium for Android application testing

Test Case|Purpose|Steps| Expected Result | Actual Result |Pass/Fail|
|:---|:---|:---|:---|:---|:---|
|1|Test if program opens as expected and without crashing|Open the application|The application should display without crashing|N/A|Pass/Fail|
2|Test if employee can add Floor Product|Click on Add Floor Product, fills out all necessary descriptions for floor| New Floor Product is added with correct specifications at correct store|N/A| Pass/Fail
3|Test if employee can modify Floor Product| Employee selects Floor, Employee selects modify Floor, then employee can edit Floor, submit changes and confirm changes| Existing Floor Product is edited as expected| N/A| Pass/Fail
4|Test if user can log in as employee| User inputs username and password and confirms login|If employee should log in as an employee|N/A|Pass/Fail
5|Test if user can log in as customer| User inputs username and password and confirms login|If customer should log in as a customer|N/A|Pass/Fail
6|Test if employee is able to remove an existing product from the store inventory|Employee selects floor, employee selects delete floor option, then confirms action|Expected Floor is removed from expected store database|N/A|Pass/Fail
7|Test if user is directed to expected floor item with search bar|User selects search item by name or type and category and enters search| User is directed to correct Floor|N/A|Pass/Fail
