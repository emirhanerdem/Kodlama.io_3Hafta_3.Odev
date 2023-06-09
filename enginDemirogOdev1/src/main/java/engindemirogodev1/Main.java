package engindemirogodev1;

import AccessDatabase.HibernateDao;
import AccessDatabase.JdbcDao;
import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;
import Logging.DatabaseLogger;
import Logging.FileLogger;
import Logging.MailLogger;

public class Main {

    public static void main(String[] args) throws Exception {
       //Eğitmen sınıfını çağırma
        Instructor instructor = new Instructor("Engin","Demiroğ");
        InstructorManager instructerManager = new InstructorManager();
        instructerManager.add(instructor);
        
        System.out.println("-------------------------------------------");
        
        //Kategori sınıfını çağırma
        Category category = new Category("Programlama");
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category);
        
        System.out.println("-------------------------------------------");
        
        //Kurs sınıfını çağırma
        Course course = new Course("Java + React", 1000);
        CourseManager courseManager = new CourseManager();
        courseManager.add(course);
        
        System.out.println("--------------------------------------------");
        
        //Loglama Bölümü
        FileLogger fileLogger = new FileLogger();
        fileLogger.log(instructor, course, category);
        
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log(instructor, course, category);
        
        MailLogger mailLogger = new MailLogger();
        mailLogger.log(instructor, course, category);
        
        System.out.println("--------------------------------------------");
        
        //Hibernate ve JDBC Bölümü
        HibernateDao hibernateDao = new HibernateDao();
        hibernateDao.add(category);
        hibernateDao.add(course);
        hibernateDao.add(instructor);
        
        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.add(category);
        jdbcDao.add(course);
        jdbcDao.add(instructor);
        
        
        
        
        

    }
}
