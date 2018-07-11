package com.example.jdbc.demo.jdbc.repositiores;

import com.example.jdbc.demo.jdbc.Entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface MovieRepository extends JpaRepository <Movies, String> {

    Movies findByImdbId(String imdbId);
}
