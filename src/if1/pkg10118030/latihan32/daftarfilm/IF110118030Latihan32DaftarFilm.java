/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : Program ini berisi tentang Daftar film
 */
public class IF110118030Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println("");
        Film daftar = new Film();
        
        daftar.filmName = "Batman Begins";
        daftar.filmGenre = "Action, Adventure";
        daftar.filmRating = 8.2;
        daftar.filmDuration = 140;
        daftar.nowPlaying();
        
        daftar.filmName = "The Dark Knigt";
        daftar.filmGenre = "Action, Crime, Drama";
        daftar.filmRating = 9.0;
        daftar.filmDuration = 152;
        daftar.nowPlaying();
        
        daftar.filmName = "The Dark Knigt Rises";
        daftar.filmGenre = "Action, Thriller";
        daftar.filmRating = 8.4;
        daftar.filmDuration = 165;
        daftar.nowPlaying();
        
        daftar.filmName = "Inception";
        daftar.filmGenre = "Sci-Fi, Action";
        daftar.filmRating = 8.8;
        daftar.filmDuration = 148;
        daftar.nowPlaying();
    }
    
}
