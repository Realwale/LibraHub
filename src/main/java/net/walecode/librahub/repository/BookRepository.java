package net.walecode.librahub.repository;

import net.walecode.librahub.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
