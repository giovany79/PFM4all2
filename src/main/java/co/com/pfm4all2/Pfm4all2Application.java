package co.com.pfm4all2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@SpringBootApplication
@RestController
public class Pfm4all2Application {

	@RequestMapping("/")
	public String home() {

		Transaction transaction1 = new Transaction(2, "tanqueada", "ingreso", new Date(), 1, 2, "vehiculo");
		Collection<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction1);
		transactions.stream()
				.forEach(System.out::println);

		return "Hello Docker World GIoXXXXXXXX";

	}

	public static void main(String[] args) {

		SpringApplication.run(Pfm4all2Application.class, args);


	}

}
