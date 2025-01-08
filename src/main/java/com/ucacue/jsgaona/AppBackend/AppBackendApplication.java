package com.ucacue.jsgaona.AppBackend;

import com.ucacue.jsgaona.AppBackend.model.Equip;
import com.ucacue.jsgaona.AppBackend.repository.EquipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBackendApplication.class, args);

		/*String url = "jdbc:mysql://localhost:3306/databaseequip";
		String username = "root";
		String password = "jheyson2606.";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Connected successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	/*
	@Bean
	CommandLineRunner runner(EquipRepository equipRepository) {
		return args -> {
			List<Equip> equips = Arrays.asList(
					new Equip("Monitor", "LG", "S44", "Odontologia", 20, 150)
			);
			equipRepository.saveAll(equips);
		};
	}
	*/
}
