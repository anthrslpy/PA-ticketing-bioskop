package Model;

/**
 *
 * @author anasyalaili
 */

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String idFilm;
    private String judul;
    private String genre;
    private String durasi;
    private String sinopsis;
    private String posterPath;
    private List<Jadwal> jadwalList;

    public Film(String idFilm, String judul, String genre, String durasi, String sinopsis, String posterPath) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.sinopsis = sinopsis;
        this.posterPath = posterPath;
    }
    
    public Film() {
        this.jadwalList = new ArrayList<>();
    }
    
    public void tambahJadwal(Jadwal jadwal) {
        this.jadwalList.add(jadwal);
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }    
    
    public String getIdFilm() {
        return idFilm;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public List<Jadwal> getJadwalList() {
        return jadwalList;
    }      
    
}