package com.krach.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Ouverture du contexte de l'application
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		// Chargement du bean (ici on prend un Coach générique : on n'aura donc pas accès aux méthodes spécifiques)
		Coach coach = appContext.getBean("theBaseballCoach", Coach.class);

		// Chargement d'un autre bean (autre manière de le récupérer)
		TrackCoach anotherCoach = appContext.getBean(TrackCoach.class);

		// Un dernier coach
		CricketCoach lastCoach = appContext.getBean(CricketCoach.class);
		
		// Utilisation des méthodes de notre bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		// -----------------------------------------------
		System.out.println("----------------------------");

		// Utilisation des méthodes de l'autre bean
		System.out.println(anotherCoach.getDailyWorkout());
		System.out.println(anotherCoach.getDailyFortune());
		System.out.println(anotherCoach.getEmail());
		System.out.println(anotherCoach.getTeam());

		// -----------------------------------------------
		System.out.println("----------------------------");

		// Utilisation des méthodes du dernier bean
		System.out.println(lastCoach.getDailyWorkout());
		System.out.println(lastCoach.getDailyFortune());
		System.out.println(lastCoach.getEmail());
		System.out.println(lastCoach.getTeam());
		
		// Fermeture du contexte
		appContext.close();
		
	}

}
