package Logging;

import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

public interface MainLogger {

    //Base-Main loglama bölümü diğer sınıflar buradan implement'e eder.
    void log(Instructor instructor, Course course, Category category);
}
