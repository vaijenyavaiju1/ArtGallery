package com.example.artgallery.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int artistId;

    @Column(name = "name")
    private String artistName;

    @Column(name = "genre")
    private String genre;

    @ManyToMany
    @JoinTable(name = "artist_gallery", joinColumns = @JoinColumn(name = "artistid"), inverseJoinColumns = @JoinColumn(name = "galleryid"))
    @JsonIgnoreProperties("artists")
    private List<Gallery> galleries;

    public Artist() {

    }

    public Artist(int artistId, String artistName, String genre, List<Gallery> galleries) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.genre = genre;
        this.galleries = galleries;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGalleries(List<Gallery> galleries) {
        this.galleries = galleries;
    }

    public List<Gallery> getGalleries() {
        return galleries;
    }
}