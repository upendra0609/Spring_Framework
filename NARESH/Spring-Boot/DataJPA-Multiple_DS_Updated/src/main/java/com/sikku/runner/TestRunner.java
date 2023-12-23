package com.sikku.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sikku.bar.domain.Bar;
import com.sikku.bar.repo.BarRepository;
import com.sikku.foo.domain.Foo;
import com.sikku.foo.repo.FooRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private FooRepository fooRepo;
	@Autowired
	private BarRepository barRepo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Optional<Foo> foo = fooRepo.findById(100L); Optional<Bar> bar =
		 * barRepo.findById(200L);
		 * 
		 * foo.ifPresentOrElse(System.out::println, ()->System.out.println("Empty"));
		 * bar.ifPresentOrElse(System.out::println, ()->System.out.println("Empty"));
		 */
		
		Foo f = new Foo();
		f.setFoo("AAA");
		
		Bar bar = new Bar();
		bar.setBar("BBB");
		
		fooRepo.save(f);
		
		barRepo.save(bar);
	}

}
