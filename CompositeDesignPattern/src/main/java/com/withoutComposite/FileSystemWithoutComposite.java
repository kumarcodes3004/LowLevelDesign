package com.withoutComposite;

/**
 * Hello world!
 *
 */
public class FileSystemWithoutComposite
{
    public static void main( String[] args )
    {

        Directory movieDirectory = new Directory("Movies");

        File rentalReceipt = new File("RentalReciept");
        movieDirectory.add(rentalReceipt);

        Directory comedyMovies = new Directory("ComedyMovies");
        movieDirectory.add(comedyMovies);

        File dhurandar = new File("Dhurandar");
        movieDirectory.add(dhurandar);

        movieDirectory.ls();
    }
}
