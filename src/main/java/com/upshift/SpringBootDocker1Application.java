package com.upshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootDocker1Application {

    @GetMapping("/")
    public String index(final Model model) {
      System.out.println("This will render a page");
        return "index";
    }

	public static void main(String[] args) {
		System.out.println("This is a simple project");
		SpringApplication.run(SpringBootDocker1Application.class, args);
	}

}
