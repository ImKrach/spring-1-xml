package com.krach.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Ouverture du contexte de l'application
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		// Chargement du bean
		Coach coach = appContext.getBean("theBaseballCoach", Coach.class);

		// Chargement d'un autre bean (autre manière de le récupérer)
		Coach anotherCoach = appContext.getBean(TrackCoach.class);

		// Un dernier coach
		Coach lastCoach = appContext.getBean(CricketCoach.class);
		
		// Utilisation des méthodes de notre bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		// -----------------------------------------------
		System.out.println("----------------------------");

		// Utilisation des méthodes de l'autre bean
		System.out.println(anotherCoach.getDailyWorkout());
		System.out.println(anotherCoach.getDailyFortune());

		// -----------------------------------------------
		System.out.println("----------------------------");

		// Utilisation des méthodes du dernier bean
		System.out.println(lastCoach.getDailyWorkout());
		System.out.println(lastCoach.getDailyFortune());
		
		// Fermeture du contexte
		appContext.close();
		
	}

}
