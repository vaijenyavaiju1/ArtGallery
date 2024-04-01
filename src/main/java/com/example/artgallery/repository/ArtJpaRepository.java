package com.example.artgallery.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.artgallery.model.*;
import java.util.*;

@Repository
public interface ArtJpaRepository extends JpaRepository<Art, Integer> {

    List<Art> findByArtist(Artist artist);
}