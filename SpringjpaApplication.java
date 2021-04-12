package com.springjpa.springjpa;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springjpa.exception.InvalidIdException;
import com.springjpa.model.Employee;
import com.springjpa.model.Person;
import com.springjpa.model.Skill;
import com.springjpa.service.DepartmentService;
import com.springjpa.service.EmployeeService;
import com.springjpa.service.PersonService;
import com.springjpa.service.SkillService;

@SpringBootApplication
@ComponentScan({ "com*" })
@EnableJpaRepositories(basePackages = "com.springjpa.dao")
@EntityScan({ "com.springjpa.model" })
public class SpringjpaApplication // implements CommandLineRunner
{
	private static final Logger LOG = LoggerFactory.getLogger("JCG");

	@Autowired
	private static PersonService personService;
	@Autowired
	private static EmployeeService empService;
	@Autowired
	private static DepartmentService deptService;
	@Autowired
	private static SkillService skillService;

	public static void main(String[] args) {
		// SpringApplication.run(SpringjpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringjpaApplication.class, args);
		personService = context.getBean(PersonService.class);
		//LOG.info("Before inserting rows count=" + personService.countPersons());
		//Save person object
		Person p=new Person();
//		p.setName("Sai");
//		p.setAge(23);
//		p=new Person();
//		p.setName("Sri");
//		p.setAge(25);
//		personService.createPerson(p);
		
		//LOG.info("After inserting rows count=" + personService.countPersons());
		
		//update person
//		Person person=personService.getPerson(1L);
//		LOG.info("person object="+person);
//		person.setAge(23);
//		person.setName("Sai");
//		personService.editPerson(person);
//		
		
		
		int result = personService.updatePersonAge(32, 1);
		System.out.println(result);
		
		//Update person
//		try {
//			Person per = personService.getPersonById(1);
//			LOG.info("Person=" + per);
//			per.setAge(23);
//			per.setName("Sai");
//			personService.editPerson(per);
//		} catch (InvalidIdException e) {
//			LOG.error(e.getMessage());
//		}
		
		// display person objects
		List<Person> personList=personService.getAllPersons();
		personList.forEach(obj->System.out.println(obj));
		
		/*empService = context.getBean(EmployeeService.class);
		deptService = context.getBean(DepartmentService.class);
		skillService=context.getBean(SkillService.class);*/

//		Department dept = new Department();
//		dept.setName("Chennai");
		/*Department dept=deptService.get(2);
		deptService.save(dept);
		Employee emp = new Employee();
		emp.setName("Sri");
		emp.setPermanent(true);
		emp.setSalary(45000);
		emp.setDateOfBirth(new Date());
		emp.setDepartment(dept);
		empService.save(emp);*/

	// To find employee--> department
		// Employee employee = empService.get(3);
		// LOG.debug("Employee:{}", employee);
		// LOG.debug("Department:{}", employee.getDepartment().getName());
		// System.out.println(employee.getDepartment().getName());
		//To find department-->employee
		// Department dep=deptService.get(9);
		// System.out.println(dep.getEmployeeList());

		//Employee - skill
//		Employee e=empService.get(2);
//		Skill s=skillService.get(1);
//		Set<Skill> skillSet=new HashSet<>();
//		skillSet.add(s);
//		e.setSkillList(skillSet);
//		empService.save(e);
		
		//Fetch Employee skill 
	//List<Employee> employees = empService.getAllPermanentEmployees(); 
	//LOG.debug("Permanent Employees:{}", employees); 
	//employees.forEach(e -> LOG.debug("Skills:{}", e.getSkillList())); 
	//LOG.info("End"); 
	/*for(Employee e:employees)
	{
		System.out.println(e);
		Set<Skill> slist=e.getSkillList();
		for(Skill s:slist)
		{
			System.out.println(s);
		}
		
	}

	}*/
	/*
	 * public void run(String... strings) {
	 * 
	 * LOG.info("Current objects in DB: {}", service.countPersons());
	 * 
	 * Person person = service.createPerson(new Person("Shubham", 23));
	 * LOG.info("Person created in DB : {}", person);
	 * 
	 * LOG.info("Current objects in DB: {}", service.countPersons());
	 * 
	 * person.setName("Sai"); Person editedPerson = service.editPerson(person);
	 * LOG.info("Person edited in DB  : {}", person);
	 * 
	 * // service.deletePerson(person); // LOG.info("After deletion, count: {}",
	 * service.countPersons()); }
	 */
}
}
