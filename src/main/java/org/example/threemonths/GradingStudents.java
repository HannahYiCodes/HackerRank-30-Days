package org.example.threemonths;

import java.util.List;

class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i=0; i<grades.size(); i++){
            int grade = grades.get(i);
            int rem = grade % 5;
            int difference = 5 - rem;

            if(grade >= 38 && difference < 3){
                grades.set(i, grade+difference);
            }
        }
        return grades;
    }
}
