package ru.student.cw2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.student.cw2022.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {


}