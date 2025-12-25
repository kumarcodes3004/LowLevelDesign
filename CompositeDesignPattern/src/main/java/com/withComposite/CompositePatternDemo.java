package com.withComposite;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        Directory comedyMovies = new Directory("ComedyMovies");

        File dhol = new File("Dhol");
        File garamMasala = new File("Garam Masala");
        File dhurandar = new File("Dhurandar");

        movieDirectory.addFileOrDirectory(dhurandar);
        movieDirectory.addFileOrDirectory(comedyMovies);

        comedyMovies.addFileOrDirectory(dhol);
        comedyMovies.addFileOrDirectory(garamMasala);


        movieDirectory.ls();
    }

}
