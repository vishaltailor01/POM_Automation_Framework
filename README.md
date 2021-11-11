# Automation-Framework 

## Frame work Design Pattern 
### Page Object Model with Page Factory

The Page Object Model is a design pattern. Design patterns in programming help us solve common problems in common ways following similar approaches that have worked for similar problems that others have faced.
The Page Object Model is super straight forward; one class typically represents one page in the application under test. This is known as the Page Object.
Page Objects encapsulate actions and elements. Elements are private. And actions are public. This allows callers to see all of the actions that they can take on a page, without having to be exposed to the complexity "under the hood".

#### Advantages of Page Object Model

* Helps with easy maintenance: POM is useful when there is a change in a UI element or there is a change in an action. An example would be: a drop-down menu is changed to a radio button. In this case, 
POM helps to identify the page or screen to be modified. As every screen will have different java files, this identification is necessary to make the required changes in the right files. This makes test cases easy to maintain and reduces errors.
* Helps with reusing code: All screens are independent. By using POM, one can use the test code for one screen, and reuse it in another test case. There is no need to rewrite code, thus saving time and effort.
* Readability and Reliability of scripts: When all screens have independent java files, one can easily identify actions that will be performed on a particular screen by navigating through the java file. If a change must be made to a certain section of code, it can be efficiently done without affecting other files.

### Page Factory
Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements.
* @FindBy: An annotation used in Page Factory to locate and declare web elements using different locators. Below is an example of declaring an element using @FindBy
@FindBy(id="elementId") WebElement element;
* initElements(): initElements is a static method in Page Factory class. Using the initElements method, one can initialize all the web elements located by @FindBy annotation.

## Behavior Driven Devlopment (BDD)

BDD is a collaborative approach,BDD practitioners may use Cucumber to automate their documentation.
Gherkin is a simple syntax that allows teams to write business readable, executable specifications. 
Some Gherkin keywords are Given, When, and Then, but not all text that uses these words is Gherkin.
Given is the context for the scenario. We’re putting the system into a specific state, ready for the scenario to unfold.
When is an action. Something that happens to the system that will cause something else to happen: an outcome.
Then is the outcome. It’s the behaviour we expect from the system when this action happens in this context.

## Technologies Used:
* Selenium WebDriver
* JDK (Java Development Kit)
* JUnit (Unit Framework) - Data Driven Approach
* Log4j (logging API) • Maven (Build Automation Tool)
* Cucumber (write the test case in feature file help of gherkin language)
* Apache POI API (Read-Write utilities for Excel - Test Data Handling) Eclipse/IntelliJ (Java Editor)
* Browser - Google Chrome/FireFox

## Automation Framework Architecture:
* POM (Page Object Model) Design Page Factory API of WebDriver
* Maven (Build Automation Tool)
* Test Libraries for different UI Pages
* Test Utilities for different generic functions
* Report - Dashboard (Pass/Fail Test) by using Extent Report
* Jenkins - Continuous Integration Tool
* git and GITHub Repo (Code Versioning Tool)

Steps to clone execute the tests git clone https://github.com/vishaltailor01/POM_Automation_Framework

