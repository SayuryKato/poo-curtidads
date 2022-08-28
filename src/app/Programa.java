package app;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentarios;
import entidades.Post;


public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Have a nice trip!");
		Comentarios c2 = new Comentarios("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 12);
		p1.addComentarios(c1);
		p1.addComentarios(c2);
		
		Comentarios c3 = new Comentarios("Good night");
		Comentarios c4 = new Comentarios("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
						"Good night guys", 
						"See you tomorrow", 5);
		p2.addComentarios(c3);
		p2.addComentarios(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}