/*Start of Week 3 Project

Create an application which calculates the average of multiple lists and prints the average
along with the correct letter grade and student name to the console.

*/

//Create map of students with list of grades
Map<String, List> studentGrades = [
    'Chris Trentham' : [99, 87, 90, 100, 80],
    'Andrew Thompson' : [50, 0, 90, 70, 70],
    'Jon Doe' : [100, 87, 91, 90, 100],
    'Jane Doge' : [86, 10, 48, 43, 48],
    'Jose Silva' : [0, 40, 80, 100, 100]
]

//Create output for students and their average grade
studentGrades.each(){name, grade ->
    println name
    println grade
}