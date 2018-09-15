package com.krach.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Ouverture du contexte de l'application
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		// Chargement du bean
		Coach coach = appContext.getBean("theBaseballCoach", Coach.class);
		
		// Utilisation des méthodes de notre bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// Fermeture du contexte
		appContext.close();
		
	}

}
