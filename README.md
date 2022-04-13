

# One Armed Bandit

 <img src="https://dictionary.cambridge.org/it/images/full/slotma_noun_002_34296.jpg?version=5.0.234" alt="One Armed Bandit machine" style="height: 100px; width:100px;"/>
 
 #### This program tries to emulate the functioning of a slot machine.



***
# BACKGROUND
The program has been developed for a didactical project on Software Testing, in TAMK, Tampere University of Applied Science.
For the testing purposes Java language and JUnit 4 is been used.

***
# HOMEPAGE
no homepage yet: upcoming

# GITHUB
if you are reading this, you are probably inside the github repository of the owner of the project: 
> [github repo](https://github.com/dobby-ide/UnitTestingProject)

# BUG REPORT
most of the methods are in working order and tested, but one known bug is crashing the program if a user is not following the instructions given, for example if user inputs a string instead of a number. 
Bug to be fixed in next patch.
> [known issue](https://github.com/dobby-ide/UnitTestingProject/issues/1)

# RELEASE INFORMATION

First Release is only code release, available in github v1.0.0
> [release 1.0.0](https://github.com/dobby-ide/UnitTestingProject/tags)

to download the zip file.

Second Release contains all the documentation needed to install and compile the program and the testing units.

# FILES information

To run the game you do not need any JAR dependency, so just compile:
> javac Slot.java Tokens.java User.java Main.java

and run:
> java Main.java

you need JVM installed.
However to run the test files some JAR needs to be downloaded in order for the tests to run without errors.

# FILE details

Name | Test | Details
---| --- | ---
Main.java | NO | runs the main program where Objects from different classes are initialized
Slot.java | NO | it includes methods to develop a String array that emulates the items in a lever of the slotMachine and some logic to return "coins" based on the combination achieved
User.java | NO | Simple Class that helps to get and set the user name, and an input class variable that determines whether the user will continue playing.
Tokens.java | NO | Determines the amount of credits the user is having based on win or loss of its plays; starts with 100 credits.
SlotTest.java | YES | Check 3 different methods of the class Slot.java trying to pass values that are considered normal or not expected in their parameters
TokensTest.java | YES | Check two methods of the class