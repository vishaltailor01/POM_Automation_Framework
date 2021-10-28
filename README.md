**Automation-Framework**
**Page Object Model with Page Factory in Selenium**

Page Object Model is a Design Pattern which has become popular in Selenium Test Automation. It is widely used design pattern in Selenium for enhancing test maintenance and reducing code duplication.

Page Factory is a way to initialize the web elements you want to interact with within the page object when you create an instance of it.

**Advantages of Page Object Model Framework:**

**Code reusability** – We could achieve code reusability by writing the code once and use it in different tests.

**Code maintainability** – There is a clean separation between test code and page specific code such as locators and layout which becomes very easy to maintain code. Code changes only on Page Object Classes when a UI change occurs. It enhances test maintenance and reduces code duplication.

Object Repository – Each page will be defined as a java class. All the fields in the page will be defined in an interface as members. The class will then implement the interface.

**Readability** – Improves readability due to clean separation between test code and page specific code

**POM:** As per the Page Object Model, we have maintained a class for every web page. Each web page has a separate class and that class holds the functionality and members of that web page. Separate classes for every individual test.

I will explain based on the below-mentioned test automation framework structure


Packages: We have separate packages for Pages and Tests.

All the web page related classes come under the Pages package and all the tests related classes come under Tests package.
