# ant-common-tasks

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Project status](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)


# About

This a useful collection of ant tasks, that executes advanced tools command lines, like Maven, Gradle, etc.
As the name suggests, ant common tasks are the activities that are common to Java developer with Maven e Graddle tools:

- build
- test
- check (pmd, checkstyle, spotbugs)
- site


# Technologies

- Java
- Ant
- Maven
- Graddle

# Install

First of all, you need Java, Maven, Graddle and Ant installed on your pc, with JAVA_HOME, M2_HOME, GRADLE_HOME and ANT_HOME already configured. <br />

Then execute:

```bash
# clone it
git clone git@github.com:fernando-romulo-silva/ant-common-task.git

# access the project folder
cd ant-common-tasks

# execute
ant deploy-ant-lib
```

# How to Use

create a build.xml on the project root's:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project name="your_project">
	<import file="ant-common-tasks/src/main/resources/target/maven/maven-build.xml" />
	<import file="ant-common-tasks/src/main/resources/target/maven/maven-scm-git.xml" />
</project>
```

Check the tasks:

```bash
ant -p built.xml
```
