# ant-direct

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Project status](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)


# About

This a useful collection of ant tasks, that executes advanced tools command lines, like Maven, Gradle, etc. 

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
git clone https://github.com/fernando-romulo-silva/direct-ant

# access the project folder
cd direct-ant

# execute
ant deploy-ant-lib
```

# How to Use

create a build.xml on the project root's:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project name="your_project">
	<import file="direct-ant/src/main/resources/target/maven/maven-build.xml" />
	<import file="direct-ant/src/main/resources/target/maven/maven-scm-git.xml" />
</project>
```

Check the tasks

```bash
ant -p built.xml
```