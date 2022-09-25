package basics.extended.classes;

public class GetPercentOfEmployedStudent {
    public double getPercentOfEmployedStudent(Student[] studentsInfo) {
        // Write code below this line
        int numberOfValidStudents = 0;
        int numberOfEmployedStudents = 0;
        int counter = 0;

        for(Student student : studentsInfo) {
            if((student.age > 29) && (student.age < 41)) {
                numberOfValidStudents++;
            }
        }

        Student [] validStudents = new Student [numberOfValidStudents];

        for(int i = 0; i < studentsInfo.length; i++) {
            if((studentsInfo[i].age > 29) && (studentsInfo[i].age < 41)) {
                validStudents[counter] = studentsInfo[i];
                counter++;
            }
        }

        for(int i = 0; i < validStudents.length; i++) {
            if(validStudents[i].isEmployed == true) {
                numberOfEmployedStudents++;
            }
        }

        return (double) numberOfEmployedStudents / numberOfValidStudents;
        // Write code above this line
    }
}
