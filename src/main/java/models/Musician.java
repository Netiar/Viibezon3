package models;

import java.util.Objects;

public class Musician {
    private int id;
    private String name;
    private String instrument;

    private String artistType;

    private  int recordLabelId;

    private String genre;

    private String avatarUrl;


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Musician(String name, String instrument, String artistType, int recordLabelId, String genre) {
        this.name = name;
        this.instrument = instrument;
        this.artistType = artistType;
        this.recordLabelId = recordLabelId;
        this.genre = genre;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public int getRecordLabelId() {
        return recordLabelId;
    }

    public void setRecordLabelId(int recordLabelId) {
        this.recordLabelId = recordLabelId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setBand(String band) {
        this.artistType = band;
    }

    public String toString() {
        return "Musician: " + this.name + " " + this.instrument + " " + this.artistType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return id == musician.id && recordLabelId == musician.recordLabelId && name.equals(musician.name) && instrument.equals(musician.instrument) && artistType.equals(musician.artistType) && genre.equals(musician.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, instrument, artistType, recordLabelId, genre);
    }
}
