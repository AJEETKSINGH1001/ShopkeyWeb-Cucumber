# Shopkey Web Store

## Overview

Shopkey is a platform designed for online shopping. Using Selenium with Java and Cucumber, the test automation framework ensures efficient and reliable testing, offering benefits like enhanced test coverage, improved collaboration through BDD scenarios, and robustness in detecting web issues.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Installation

### Prerequisites

Ensure you have:

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/install.html)

### Clone and Install

```sh
git clone https://github.com/yourusername/shopkey.git
cd shopkey
mvn clean install

*Usage*
Run tests using Maven. Write test scenarios in Gherkin language with Cucumber
*Project Structure*

### Project Structure

ShopkeyWeb-Cucumber/
├── src/
│   ├── main/
│   │   └── java/
│   ├── test/
│   │   ├── java/
│   │   │   ├── stepdefinitions/
│   │   │   │   ├── HomePageSteps.java
│   │   │   │   ├── LogoSteps.java
│   │   │   │   ├── ProductSearchSteps.java
│   │   │   ├── testrunner/
│   │   │   │   └── RunCucumberTest.java
│   │   └── resources/
│   │       ├── drivers/
│   │       └── features/
├── target/
│   ├── cucumber-reports/
│   ├── cucumber-reports.html
│   ├── cucumber-reports.json
├── pom.xml


*Running Tests*
All Tests
mvn test
Reports
Reports are generated in the target directory after tests run.

Contributing
Fork the repository.
Create a branch (git checkout -b feature/your-feature).
Commit your changes (git commit -am 'Add your feature').
Push to the branch (git push origin feature/your-feature).
Create a Pull Request.
For questions or suggestions, open an issue or contact the repository owner.

Happy Testing!

