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


## 2.1

## 2.2
## 3.1
* @Tag
    * 
## 3.2
