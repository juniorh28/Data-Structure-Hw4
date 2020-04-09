//Junior Hernandez
//As there are too many lines that are not formatted correctly I limited the test case to 300.

import java.util.*;
import java.io.*;
public class MovieGenres {

	public static int Thriller=0, 
			Action=0,
			Adventure=0, 
			Animation=0,
			Children=0,
			Comedy=0,
			Fantasy=0,
			Crime=0,
			Romance=0,
			Drama=0,
			Mystery=0,
			Sci_Fi=0,
			Documentary=0,
			War=0,
			IMAX=0,
			Horror=0,
			Musical=0,
			Western=0;

	public static double getAvg(int top, int bottom) {//takes the total of a specific genre divided by number of films
		double sum = (double)top/bottom;
		return sum;
	}
	public static void main(String[] args)throws IOException {

		
		String filePath = "movies.csv";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();//skips header
		HashMap<Integer,String[]> checkGenres = new HashMap<Integer,String[]>();//key will be the number, value will be the genres
		HashMap<Integer,Integer> checkReleaseYear = new HashMap<Integer,Integer>();
		int count=0;
		Integer howMany=0;
		
		
		
		while(br.lines() != null) {
			String theLine = br.readLine();//read in the first line
			count++;//shows that the line has been read
			String[] theLineParsed = theLine.split(",");//split the line by the commas (,)
			Integer key = Integer.parseInt(theLineParsed[0]);//the key will be the number

			
			Integer releaseYear = Integer.parseInt(theLineParsed[1].substring(theLineParsed[1].length()-5,theLineParsed[1].length()-1));
			//takes the string, gives me a substring starting from 5 before the end until the 1 before the last. turns that string into an Integer. 
			
			
			if(checkReleaseYear.containsKey(releaseYear)) {//if the key(film's year) is in the hashmap, increase its value by 1.
				//System.out.println(checkReleaseYear.containsKey(releaseYear)+" releaseYear is "+releaseYear);
				//System.out.println("year is: "+releaseYear+" value is "+checkReleaseYear.get(releaseYear));
				//System.out.println("before update value is "+checkReleaseYear.get(releaseYear));
				howMany=checkReleaseYear.get(releaseYear)+1;
				
				checkReleaseYear.put(releaseYear, howMany);
				//System.out.println("after update value is "+checkReleaseYear.get(releaseYear));
				
			}
			else {//if the key doesn't exist, create it and give it the value 1.
				checkReleaseYear.put(releaseYear,1);
			}
			
			String listOfGenres = theLineParsed[2];
			String[]genres = listOfGenres.split("\\|");
			checkGenres.put(key,genres);
			
			
			
			if(count == 300) {break;}

		}//END OF WHILE LOOP
		
		for (Integer i : checkReleaseYear.keySet()) //loops through each keys(year) and display its value out of 300
			  System.out.println("year: " + i + " amount: " + checkReleaseYear.get(i)+"/300");
			
		for (String[] value : checkGenres.values()) {//loops through each keys and increase the genres it has by one
			//System.out.println(Arrays.toString(value));
			if(Arrays.toString(value).lastIndexOf("Drama")>0) {Drama++;}//if the genre has drama increase it by one
			if(Arrays.toString(value).lastIndexOf("Thriller")>0) {Thriller++;}//if the genre has THRILLER increase it by one
			if(Arrays.toString(value).lastIndexOf("Adventure")>0) {Adventure++;}
			if(Arrays.toString(value).lastIndexOf("Animation")>0) {Animation++;}
			if(Arrays.toString(value).lastIndexOf("Children")>0) {Children++;}
			if(Arrays.toString(value).lastIndexOf("Comedy")>0) {Comedy++;}
			if(Arrays.toString(value).lastIndexOf("Fantasy")>0) {Fantasy++;}
			if(Arrays.toString(value).lastIndexOf("Crime")>0) {Crime++;}
			if(Arrays.toString(value).lastIndexOf("Romance")>0) {Romance++;}
			if(Arrays.toString(value).lastIndexOf("Mystery")>0) {Mystery++;}
			if(Arrays.toString(value).lastIndexOf("Sci-Fi")>0) {Sci_Fi++;}
			if(Arrays.toString(value).lastIndexOf("Documentary")>0) {Documentary++;}
			if(Arrays.toString(value).lastIndexOf("War")>0) {War++;}
			if(Arrays.toString(value).lastIndexOf("IMAX")>0) {IMAX++;}
			if(Arrays.toString(value).lastIndexOf("Musical")>0) {Musical++;}
			if(Arrays.toString(value).lastIndexOf("Western")>0) {Western++;}
			if(Arrays.toString(value).lastIndexOf("Action")>0) {Action++;}
			if(Arrays.toString(value).lastIndexOf("Horror")>0){Horror++;}
			
		
		}
		System.out.printf(Thriller+" amount of Thriller. Avg number of Thriller films is %.2f %n",getAvg(Thriller,count));
		System.out.printf(Drama+ " amount of Drama. Avg number of Drama films is %.2f %n",getAvg(Drama,count));
		System.out.printf(Adventure+ " amount of Adventure. Avg number of Adventure films is %.2f %n",getAvg(Adventure,count));
		System.out.printf(Animation+ " amount of Animation. Avg number of Animation films is %.2f %n",getAvg(Animation,count));
		System.out.printf(Children+ " amount of Children. Avg number of Children films is %.2f %n",getAvg(Children,count));
		System.out.printf(Comedy+ " amount of Comedy. Avg number of Comedy films is %.2f %n",getAvg(Comedy,count));
		System.out.printf(Fantasy+ " amount of Fantasy. Avg number of Fantasy films is %.2f %n",getAvg(Fantasy,count));
		System.out.printf(Crime+ " amount of Crime. Avg number of Crime films is %.2f %n",getAvg(Crime,count));
		System.out.printf(Romance+ " amount of Romance. Avg number of Romance films is %.2f %n",getAvg(Romance,count));
		System.out.printf(Mystery+ " amount of Mystery. Avg number of Mystery films is %.2f %n",getAvg(Mystery,count));
		System.out.printf(Sci_Fi+ " amount of Sci-Fi. Avg number of Sci-Fi films is %.2f %n",getAvg(Sci_Fi,count));
		System.out.printf(Documentary+ " amount of Documentary. Avg number of Documentary films is %.2f %n",getAvg(Documentary,count));
		System.out.printf(War+ " amount of War. Avg number of War films is %.2f %n",getAvg(War,count));
		System.out.printf(IMAX+ " amount of IMAX. Avg number of IMAX films is %.2f %n",getAvg(IMAX,count));
		System.out.printf(Musical+ " amount of Musical. Avg number of Musical films is %.2f %n",getAvg(Musical,count));
		System.out.printf(Western+ " amount of Western. Avg number of Western films is %.2f %n",getAvg(Western,count));
		System.out.printf(Action+ " amount of Action. Avg number of Action films is %.2f %n",getAvg(Action,count));
		System.out.printf(Horror+ " amount of Horror. Avg number of Horror films is %.2f %n",getAvg(Horror,count));
		System.out.println("there are "+count+" films");
		System.out.println();
		
		br.close();
	}//End of Main
	
}//End of Class
