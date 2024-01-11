package com.helloWorld.helloWorld.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class HelloWorldController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return  "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		 return "Responsabilidade Pessoal," +
	            "\nMentalidade de Crescimento, " +
				"\nOrientação ao Futuro, " +
	            "\nComunicação," +
				"\nAtenção aos Detalhes, " +
	            "\nProativida, " +
				"\nTrabalho em Equipe, " +
	            "\nPersistência ";
	            
 }
	@GetMapping("/objetivos")
	public String objetivos() {
		return  "Objetivos de Aprendizagem da Semana: " +
	            "1º Conseguir absorver o maxímo de conteúdo; " +
	            "2º Conseguir entregar todas as atividades; " +
	            "3º Praticar Java nas horas vagas! ";
				
	}
	
	
	
	

}
