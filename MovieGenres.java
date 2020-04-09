//Junior Hernandez
//As there are too many lines that are not formatted correctly I limited the test case to 200.

import java.util.*;
import java.io.*;
public class MovieGenres {

	public static void main(String[] args)throws IOException {

		Genre list = new Genre();
		String filePath = "C:\\Users\\junio\\Downloads\\ml-latest-small(1)\\ml-latest-small\\movies.csv";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();//skips header
		HashMap<Integer,String[]> checkGenres = new HashMap<Integer,String[]>();//key will be the number, value will be the genres
		HashMap<String,String[]> checkReleaseYear = new HashMap<String,String[]>();
		int count=0;
		//String[] genres;
		while(br.lines() != null) {
			String theLine = br.readLine();//read in the first line
			count++;
			String[] theLineParsed = theLine.split(",");//split the line by the commas (,)
			Integer key = Integer.parseInt(theLineParsed[0]);//the key will be the number
			//String value = theLineParsed[2];


			String year = theLineParsed[1].substring(theLineParsed[1].length()-6);
			//takes the part of line, title (year), gives me the last 6 char which is (YYYY)
			System.out.println(theLine+" year: "+year);
			String listOfGenres = theLineParsed[2];
			String[]genres = listOfGenres.split("\\|");
			checkGenres.put(key,genres);



			String[] a = {"a","b"};
			String[] tempGenres = a;
			for (String i: tempGenres) {
				System.out.println(i);

			}
			/*for(int i=0; i<genres.length; i++){
				System.out.println(genres[i]);
				if(checkGenres.containsValue(genres[i])){
					System.out.println(checkGenres.containsValue(genres[i]));
					list.addOne(genres[i]);
				}
				else{System.out.println("did not enter if statement");}
			}*/

			if(count == 200) {break;}

		}//END OF WHILE LOOP
		
		list.listAll();


		for(Integer i : checkGenres.keySet()) {
			System.out.print("key : "+i);
			for(String j : genres)
				System.out.println(" genres: "+j);

		}
		System.out.println("there are "+count+" lines");
		
		
		br.close();
	}//End of Main
	
}//End of Class
