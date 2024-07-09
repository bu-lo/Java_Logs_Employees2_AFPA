package fr.afpa.logs;

import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22", "Don", "Michel", 2000.0, "1995-05-22");
		Employee employee2 = new Employee("11ABC23", "Joly", "Angelina", 10000.0, "1975-06-04");
		Employee employee3 = new Employee("11ABC24", "Pitt", "Brad", 10000.0, "1963-12-18");
		Employee employee4 = new Employee("11ABC25", "Bonette", "John", 5000.0, "1995-07-19");

		// ex test, modifier registrationNumber avec un setter
		// pour gérer une exception -> utiliser TRY... CATCH
		try {
			employee1.setRegistrationNumber("11ABC21");
		
		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION
			// dans notre cas juste un message d'erreur
			logger.info(exceptionToProcess.getMessage()); // appelle le message de l'exception ***
		}

		// modifier NOM avec un setter
		try {
			employee1.setLastName("Chloe");

		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION - ici idem message d'erreur
			logger.info(exceptionToProcess.getMessage()); // appelle le message de l'exception ***
		}

		// modifier PRENOM avec un setter
		try {
			employee1.setFirstName("Chloe");

		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION - ici idem message d'erreur
			logger.info(exceptionToProcess.getMessage()); // appelle le message de l'exception ***
		}

		// modifier DATE
		try {
			employee1.setBirthDay("1995-07-19");

		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION - ici idem message d'erreur
			logger.info(exceptionToProcess.getMessage()); // appelle le message de l'exception ***
		}


		// afficher les informations des employés

		logger.info("Employee n1:");
		logger.info("Registration Number : " + employee1.getRegistrationNumber());
		logger.info("Last Name : " + employee1.getLastName());
		logger.info("First Name : " + employee1.getFirstName());
		logger.info("Salary : " + employee1.getSalary());
		logger.info("Net Salary : " + employee1.toNetSalary());
		logger.info("Birth Day : " + employee1.getBirthDay());
		logger.info("Days before next Birth Day : " + employee1.daysBeforeBirthDay());

		logger.info("-----------------------------------------------------");

		logger.info("Employee n2:");
		logger.info("Registration Number : " + employee2.getRegistrationNumber());
		logger.info("Last Name : " + employee2.getLastName());
		logger.info("First Name : " + employee2.getFirstName());
		logger.info("Salary : " + employee2.getSalary());
		logger.info("Net Salary : " + employee2.toNetSalary());
		logger.info("Birth Day : " + employee2.getBirthDay());
		logger.info("Days before next Birth Day : " + employee2.daysBeforeBirthDay());

		logger.info("-----------------------------------------------------");

		logger.info("Employee n3:");
		logger.info("Registration Number : " + employee3.getRegistrationNumber());
		logger.info("Last Name : " + employee3.getLastName());
		logger.info("First Name : " + employee3.getFirstName());
		logger.info("Salary : " + employee3.getSalary());
		logger.info("Net Salary : " + employee3.toNetSalary());
		logger.info("Birth Day : " + employee3.getBirthDay());
		logger.info("Days before next Birth Day : " + employee3.daysBeforeBirthDay());

		logger.info("-----------------------------------------------------");

		logger.info("Employee n4:");
		logger.info("Registration Number : " + employee4.getRegistrationNumber());
		logger.info("Last Name : " + employee4.getLastName());
		logger.info("First Name : " + employee4.getFirstName());
		logger.info("Salary : " + employee4.getSalary());
		logger.info("Net Salary : " + employee4.toNetSalary());
		logger.info("Birth Day : " + employee4.getBirthDay());
		logger.info("Days before next Birth Day : " + employee4.daysBeforeBirthDay());

		logger.info("-----------------------------------------------------");

		logger.info(employee1.toString());
		logger.info(employee2.toString());
		logger.info(employee3.toString());
		logger.info(employee4.toString());

		logger.info("-----------------------------------------------------");

		logger.info(employee1.fullName());
		logger.info(employee2.fullName());
		logger.info(employee3.fullName());
		logger.info(employee4.fullName());

		logger.info("-----------------------------------------------------");

		ArrayList<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		listEmployees.add(employee4);

		for (Employee employee : listEmployees) {
			logger.info("TEST {} LOGGERINFO IN A SENTENCE",employee);
			//logger.info(employee.toString());
		}
	}
}
