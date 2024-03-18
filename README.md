# ant-common-tasks

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Project status](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)

# Project status

I change this project constantly improving and adding new tasks, click [here](docs/STATUS.md) to follow up.

# The Problem

So you are using your build tool with a lot plugins/add-ons and you have to write big terminal commands, for instance, to create only a PMD report, instead you execute a full command like:

```bash
mvn -T 3 --offline \
         -DskipSurefireReport=true \
         -Dmaven.test.skip=true \
         -Dspotbugs.skip=true \
         -Dcheckstyle.skip=true \
         -Dmaven.javadoc.skip=true \
         -Djdepend.skip=true \
         -Dtaglist.skip=true \
         -Dmpir.skip=true \
         -Dcpd.skip=true \
         -Djacoco.skip=true \
         site
```

Should be nicer if had configured tasks to executed COMMON operations that save time? <br />
Instead of the big commands, you just executed something like it:

```bash
ant site-pmd
```

# About

As the name suggests, ant common tasks are the activities that are common to Java developer with Maven e Graddle tools. <br />
This a useful collection of ant tasks, that executes advanced tools command lines, like Maven, Gradle, etc. <br />
This project was developed to work with the [allset-java](https://github.com/fernando-romulo-silva/allset-java) project, the ant tasks are align with plugins/tools used by the allset-java project. <br />
Using these tasks, you can save time on your daily work.

# Technologies

Technologies used on this project:

- Git
- Java
- Ant
- Maven
- Graddle (future)

# Requirements

These are the requirements:

- Git

```bash
# check the git version
git --version
```

- Java version >= 17 

```bash
# check the Java version
java --version
```

- Maven version >= 3.8.8

```bash
# check the Maven version
maven --version
```

- Ant version >= 1.10

```bash
# check the Ant version
ant -version
```

# Install

First of all, you need Java, Maven, Graddle and Ant installed on your pc, with JAVA_HOME, M2_HOME, GRADLE_HOME and ANT_HOME already configured. <br />

Then execute:

```bash
# clone it
git clone git@github.com:fernando-romulo-silva/ant-common-task.git

# access the project folder
cd ant-common-tasks

# execute
ant install
```
It'll create jar and put it into the $ANT_HOME/lib folder, thus you'll able to you use it.

# How to Use

## Targets

The targets are separated into groups:

### Group art

The art groups are related to the project's artifacts, which include libs, plugins, libs source and libs documents.
There are these tasks:

- art-download-lib (Download all project's libs)
- art-download-source (Download all project's libs source)
- art-download-plugin (Download all project's plugins)
- art-purge (Remove libs from local repository)

### Group build

The art groups are related to the project's building process, which include clean artifacts, compile sources, packaging, and more:

- build-clean (Clean the project's artifacts)
- build-compile (Compile the project's classes)
- build-package (Create packages JAR, WAR, EAR, APK, etc. of the project WITH tests and check code) 
- build-package-simple (Create packages of the project WITHOUT tests and check code)
- build-package-doc (Create project javadoc's package)
- build-package-src (Create project source's packages)
- build-install (Create packages and put it in the local repository WITH tests and check code)
- build-install-simple (Create package and put project in the local repository WITHOUT tests and check 
code)

### Group scm 

### Group realease, 
install a taged version,

### Group test

### Group check 

pmd, checkstyle, spotbugs, jacoco

### Group report

### Group site

## Import

Create a build.xml on your project root's:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project name="your_project">

	<import>
		<!-- import art group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-art.xml" />
		
		<!-- import build group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-build.xml" />
		
		<!-- import test group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-test.xml" />
		
		<!-- import site group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-site.xml" />
		
		<!-- import check group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-check.xml" />
		
		<!-- import report group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-report.xml" />
		
		<!-- import scm group targets -->
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-scm.xml" />			
	</import>
	...

</project>
```

Check the tasks:

```bash
ant -p build.xml
```
