CREATE TABLE IF NOT EXISTS gallery (
    id int PRIMARY KEY AUTO_INCREMENT ,
    name varchar(255),
    location varchar(255)
);

CREATE TABLE IF NOT EXISTS artist (
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    genre varchar(255)
);

CREATE TABLE IF NOT EXISTS art (
    id int PRIMARY KEY AUTO_INCREMENT,
    title varchar(255),
    theme varchar(255),
    artistId int ,
    FOREIGN KEY(artistId) REFERENCES artist(id)
);

CREATE TABLE IF NOT EXISTS artist_gallery (
    artistId int,
    galleryId int ,
    PRIMARY KEY (artistId,galleryId),
    FOREIGN KEY(artistId) REFERENCES artist(id),
    FOREIGN KEY(galleryId) REFERENCES gallery(id)
);