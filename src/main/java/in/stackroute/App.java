package in.stackroute;


import in.stackroute.model.Course;
import in.stackroute.model.Professor;
import in.stackroute.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Course course=ctx.getBean("course",Course.class);
		Student student=ctx.getBean("student",Student.class);
//		Professor professor=ctx.getBean("professor",Professor.class);
		course.setProfessor( ctx.getBean("professor",Professor.class));

	}

}
