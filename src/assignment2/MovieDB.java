/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
/**
 *
 * @author hp
 */
public class MovieDB {
    private static final int BUFFER_SIZE=2;
    int effectiveNbMovies=0;
Movie[]moviesList=new Movie[BUFFER_SIZE];
    public Movie[] add(Movie movie){
    if(moviesList.length==effectiveNbMovies){
        Movie[]newmoviesList = new Movie[moviesList.length*2];
   System.arraycopy(moviesList,0,newmoviesList,0,moviesList.length);
   return newmoviesList;
}
    effectiveNbMovies++;
    moviesList[effectiveNbMovies]=movie;
}
    void display(){
    for(Movie movie:moviesList){
        System.out.println("Movie:"+movie.getName()+","+movie.getReleaseyear());
    }
}

    
}
