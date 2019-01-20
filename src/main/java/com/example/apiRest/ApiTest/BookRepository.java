package com.example.apiRest.ApiTest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
	 // custom query to search to blog post by title or content
	List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
}
