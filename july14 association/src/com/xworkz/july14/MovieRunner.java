package com.xworkz.july14;

public class MovieRunner {
public static void main(String[] arg)
{
	System.out.println("Running main in MovieRunner");
	Movie movie=new Movie("Chandramuki");
	movie.movietype(MovieType.HORROR);
	movie.timings="2.30";
	movie.printInfo();
}
}
