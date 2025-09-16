# Selenium Java TestNG POM Project – The Internet Herokuapp

This repository demonstrates advanced automation skills using Selenium WebDriver, Java, TestNG, and the Page Object Model (POM) design pattern. The test suite covers multiple scenarios on [the-internet.herokuapp.com](https://the-internet.herokuapp.com), a popular demo website for automation practice.

## Features

- **Selenium WebDriver** for browser automation
- **TestNG** for test orchestration
- **Java** as primary language
- **Page Object Model** for maintainability
- **Maven** for dependency management
- **Rich set of UI scenarios**

## Automated Scenarios

- Login Authentication (valid/invalid)
- File Upload
- Dynamic Controls (checkbox add/remove, input enable/disable)
- Drag and Drop
- Alerts & Prompts
- Dropdown Selection
- Broken Images detection
- Add/Remove Elements
- Checkboxes
- Floating Menu
- Form Authentication
- JavaScript Error detection
- Sortable Data Tables
- Disappearing Elements

## Getting Started

### Prerequisites

- Java 8+
- Maven
- Chrome/Firefox browser

### Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/mani3196/selenium-java-testng-pom-internet.git
   cd selenium-java-testng-pom-internet
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

3. Run tests:
   ```bash
   mvn test
   ```
   or
   ```bash
   mvn test -DsuiteXmlFile=testng.xml
   ```

## Project Structure

```
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/pages/      # Page Objects
│   └── test/
│       └── java/
│           └── com/example/tests/      # TestNG Tests
├── testng.xml
``` 

## Extending the Suite

- Add new Page Object classes for each page in `com.example.pages`
- Add new Test classes in `com.example.tests`
- Update `testng.xml` to include new tests

## Authors

- [mani3196](https://github.com/mani3196)

## License

This project is intended for educational and demonstration purposes.