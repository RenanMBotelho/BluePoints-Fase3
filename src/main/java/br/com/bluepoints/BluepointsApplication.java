package br.com.bluepoints;

import br.com.bluepoints.model.Reciclagem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BluepointsApplication {

	public static void main(String[] args) {
	SpringApplication.run(BluepointsApplication.class, args);

	/*public static void main(String[] args) {

		Reciclagem reciclagem = new Reciclagem(
				2L, // código usuário
				"Centro de Reciclagem", // local
				LocalDate.of(2024, 10, 10), // data
				10.0 // peso em kg
		);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bluepoints"); // dever ir o nome da unidade de persistência, do arquivo persistence.xml
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(reciclagem);
		em.getTransaction().commit();
		em.close();
	*/
	}

}
