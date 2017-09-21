/*Start of Week 3 Project

Create an application which calculates the average of multiple lists and prints the average
along with the correct letter grade and student name to the console.

*/

//Create map of students with list of grades
Map studentGrades = [
    'Chris Trentham' : [99, 87, 90, 100, 80],
    'Andrew Thompson' : [50, 0, 90, 70, 70],
    'Jon Doe' : [80, 87, 91, 80, 85],
    'Jane Doge' : [86, 70, 78, 73, 78],
    'Jose Silva' : [0, 40, 80, 100, 100]
]

studentGrades.each(){name, grades ->    //begin loop through grades

    //calculate average of each students grades
    float average = grades.sum() / grades.size()
    
    //create if/else to determine lettergrade
    String letterGrade
    if(average >= 90 && average <= 100){
        letterGrade = 'A'
        }
    else if(average >= 80 && average < 90){
        letterGrade = 'B'
        }
    else if(average >= 70 && average < 80){
        letterGrade = 'C'
        }
    else if(average >= 60 && average < 70){
        letterGrade = 'D'
        }
    else if(average < 60){
        letterGrade = 'F'
        }
    
    println "${name} - ${average} - ${letterGrade}"    //print name - average - lettergrade
    }