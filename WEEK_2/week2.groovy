//print "Hello World" to the console

println "Hello World"

//create constants that are made of first and last name, do not use def

import static Constants.*

//A constant is a defined object that cannot be changed

class Constants {
    static final String FIRST_NAME = "Chris"
    static final String LAST_NAME = "Trentham"
    }
    
//A variable is an object that you expect to be changed through the running of the program    

//Initiate a numeric variable and assign value 1337 without using def.

Integer leet = 1337

//Divide variable by any number and assign to new variable

BigDecimal leetDivided = leet / 23

/*
A constant is a value that will not be changed throughtout the program,
a variable is a value that can be changed as needed throughout the program.
*/

//Print 5 seperate math problems

println leet * 24
println leetDivided + 83485
println leet % 3 //It's the remainder!!!
println leetDivided ** 8
println leet / 14

//print the 4 variables created

println "The first name constant is ${FIRST_NAME}"
println "The last name constant is ${LAST_NAME}"
println "The original variable is ${leet}"
println "The divided variable is ${leetDivided}"

/*
Data types are the type of information stored in a variable or constant.
These types can include strings, which is a series of characters or
integers, which are whole numbers. That's just to name a few, there are many
different data types
*/