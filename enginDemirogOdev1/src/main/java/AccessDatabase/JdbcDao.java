package AccessDatabase;

import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao {

    @Override
    public void add(Category category) throws Exception{
        String categoryName = category.getCategoryName() + " isimli kategori";
        System.out.println(categoryName + " JDBC ile eklendi");
    }

    @Override
    public void add(Course course) throws Exception{
        String courseName = course.getCourseName() + " isimli ve";
        double coursePrice = course.getCoursePrice();
        System.out.println(courseName + coursePrice + " fiyatlı kurs " + "JDBC ile eklendi");
    }

    @Override
    public void add(Instructor instructor) throws Exception{
        String firstName = instructor.getFirstName() + " ";
        String lastName = instructor.getLastName();
        System.out.println(firstName + lastName + " isimli eğitmen JDBC ile eklendi");
    }

}
