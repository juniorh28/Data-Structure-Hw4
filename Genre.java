
public class Genre {

	public int Thriller=0, 
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
	Musical=0,
	Western=0;
	
	public Genre() {}
	
	public void addOne(String a) {
		switch(a) {
			case "Thriller":
				this.Thriller=Thriller++;
				break;
			case "Adventure":
				Adventure++;
				break;
			case "Animation":
				Animation++;
				break;
			case "Children":
				Children++;
				break;
			case "Comedy":
				Comedy++;
				break;
			case "Fantasy":
				Fantasy++;
				break;
			case "Crime":
				Crime++;
				break;
			case "Romance":
				Romance++;
				break;
			case "Drama":
				this.Drama = Drama++;
				break;
			case "Mystery":
				Mystery++;
				break;
			case "Sci-Fi":
				Sci_Fi++;
				break;
			case "Documentary":
				Documentary++;
				break;
			case "War":
				War++;
				break;
			case "IMAX":
				IMAX++;
				break;
			case "Musical":
				Musical++;
				break;
			case "Western":
				Western++;
				break;
			default:
				System.out.println("no match for "+a);
				break;
		}
	}
	
	public void listAll() {
		System.out.println("Thriller in total "+Thriller);
		System.out.println("Adventure in total "+Adventure);
		System.out.println("Animation in total "+Animation);
		System.out.println("Comedy in total "+Comedy);
		System.out.println("Fantasy in total "+Fantasy);
		System.out.println("Crime in total "+Crime);
		System.out.println("Romance in total "+Romance);
		System.out.println("Drama in total "+Drama);
		System.out.println("Sci-Fi in total "+Sci_Fi);
		System.out.println("Documentary in total "+Documentary);
		System.out.println("War in total "+War);
		System.out.println("IMAX in total "+IMAX);
		System.out.println("Musical in total "+Musical);
		System.out.println("Children in total "+Children);
		System.out.println("Mystery in total "+Mystery);
		System.out.println("Western in total "+Western);
	}
		
	/*	String thrill ="Thriller",
		advent = "Adventure",
		anime = "Animation",
		child = "Animation",
	    comedy="Comedy",
	    fantasy = "Fantasy",
	    crime = "Crime",
	    romance = "Romance",
	    drama = "Drama",
	    mystery = "Mystery",
	    sciFi = "Sci-Fi",
	    doc = "Documentary",
	    war = "War",
	    imax = "IMAX",
	    musical = "Musical",
	    west = "Western";
	
	*/
	
	
	}
	
	

