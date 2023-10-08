# Testing_assignment-02

## 1.1 COMPUTER MOUSE 
* Data from mouse laser to pixels movement on screen (DPI/CPI)
    * Test if the calculation is correct over more then 2 movements
* Data from mouse 1, scroll wheel and mouse 2 click (Aswell as any additinal mouse buttons)
    * Test if clicks input equal to click action
* Data from scroll wheel 
    * Test if scroll wheel speed (software) is correct, relative to scroll wheeling input data

## 1.2 CATASTROPHIC FAILURE
THERAC-25:
A radiation therapy machine, that had bugs which would'nt be detected before people died. 
A hardware safety feature, converted to a software safety feature had been implemented incorrectly.


Core mistakes:
* Misunderstanding of the overall system
    * Understanding of the error messages by the operators
* Missing a lot of unit testing (automated tests)
    * Leading to the failure
* Missing proper code reviewing 
    * Apparently it was a hobby coding enthuasiast, who developed the system.

Preventions:
* Better understanding of it's feature and the meaning of error messages on the operater side.
* Better tests (Unit tests)
    * Exception/failure tests 
    * AssertEquals tests: To insure the code does what the software developer intenteded the code should do.
    * You could also use BDD so that management would understand what the desired feature should do, according to the software developer, and therefore adjust it if it didn't match what management wanted. 

## 2.1 STRING UTILITY
Project is written in JAVA with maven. Located in "string_utility_project".

## 2.2 BOWLING GAME KATA
Project is written in JAVA with maven. Located in "bowling_game_project".

## 3.1 JUNIT 5
* @Tag
    * Is used to filtre tests. 
        * Could be useful, when you want to filtre out specific tests (e.g integrations/unit tests)
    * Disables tests (Not running)
        * Could be useful, to define upcomming test to be implemented 
* @RepeatedTest
    * Repeats a test x amount 
        * Could be useful, if you want to run a test with different values. 
* @BeforeEach, @AfterEach
    * @BeforeEach
        * Runs the method with the tag, before each test.
        * Useful for setting up the class e.g mocking
    * @AfterEach
        * Runs the method with the tag, after each tests
        * Useful for cleanup e.g variables
* @BeforeAll, @AfterAll
    * @BeforeAll
        * Runs before all test has been executed in the respective class (Only runs one time)
        * Useful for setting up tests, that can utilize the same feature e.g database or object
    * @AfterAll
        * Runs after all tests has been executeed in the respective class (Only runs one time)
        * Useful for cleaning up tests e.g deleting files the test may have created
* @DisplayName
    * Used to give a name for either a test class or test function
    * Could be useful, for getting a better understanding of the test class/function (Can be named better)
    * Could also be useful, for getting a better overview of your tests (Assuming there is a lot of test)
* @Nested
    *  @Nested ables you to use varables in your nested method/classes outside the scope if the parent class also is defined @Nested (Could also be setups)
    * Useful to prevent duplicate code 
    * Useful to get a better overview of your test in your IDE
* assumeFalse, assumeTrue
    * assumeFalse
        * Assume the tested value is a false boolean
            * Otherwise throws an exception
    * assumeTrue
        * Assume the tested value is a true boolean
            * Otherwise throws an exception
## 3.2 MOCKING FRAMEWORKS
I have investigated Mockito and EasyMock
* What are their similarities?
    * Sole purpose is the same: to simulate the behavior of a object in production
    * Similar methods: Mocking, throwing exception, verifying and more...

* What are their differences?
    * Mockito supports spies
    * EasyMock can't mock private or final methods

* Which one would you prefer, if any, and why?
    * Mockito
        * Better support
        * A lot more followers/contributers
        * Able to use spies
