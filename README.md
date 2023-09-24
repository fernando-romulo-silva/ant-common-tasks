# ant-common-tasks

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Project status](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)](https://img.shields.io/badge/Project%20status-Maintenance-orange.svg)

# About

This a useful collection of ant tasks, that executes advanced tools command lines, like Maven, Gradle, etc.
As the name suggests, ant common tasks are the activities that are common to Java developer with Maven e Graddle tools.
For instance, to create only a pmd report, instead you execute a full command like:

```bash
$ mvn -T 3 --offline -DskipSurefireReport=true -Dmaven.test.skip=true -Dspotbugs.skip=true -Dcheckstyle.skip=true -Dmaven.javadoc.skip=true -Djdepend.skip=true -Dtaglist.skip=true -Dmpir.skip=true -Dcpd.skip=true -Djacoco.skip=true site
```
You just execute it:

```bash
$ ant site-pmd
```
Using these tasks, you can save time on your daily work.

# Technologies

- Java
- Ant
- Maven
- Graddle (future)

# Install

First of all, you need Java, Maven, Graddle and Ant installed on your pc, with JAVA_HOME, M2_HOME, GRADLE_HOME and ANT_HOME already configured. <br />

Then execute:

```bash
# clone it
$ git clone git@github.com:fernando-romulo-silva/ant-common-task.git

# access the project folder
$ cd ant-common-tasks

# execute
$ ant install
```
It'll create jar and put it into the $ANT_HOME/lib folder, thus you'll able to be inherited.


# How to Use

Create a build.xml on the project root's:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project name="your_project">

	<!-- import default maven commands -->
	<import>
		<javaresource classpath="ant-common-tasks.jar" name="targets/maven/maven-build.xml" />
	</import>
	...

</project>
```

Check the tasks:

```bash
$ ant -p -v build.xml
```

## Targets

## build

clean artifacts, compile, create, install, download libs and source's lib and plugins, 

## scm 

## realease, 
install a taged version,

## test

## check 

pmd, checkstyle, spotbugs, jacoco)

## report

## site
