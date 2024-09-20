import java.io.*;
import java.util.Scanner;

public class mustWatch {
    public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner input = new Scanner(System.in);

        //comparing multiple movies 
        //for (int i = 1; i <= amount(); i++){
        //     System.out.print("Input watchlist #" + i + ": ");
		//     String movie1 = input.nextLine();
        // }

        //input movies.csv
        // System.out.print("Input Movie Watch List File #1: ");
		// String movieList1 = input.nextLine();
        // System.out.print("Input Movie Watch List File #2: ");
		// String movieList2 = input.nextLine();    
        
        PrintStream out = new PrintStream(new File("mustWatchList.txt"));

        //output(movieList1, movieList2, out);
        output("watchlist-probablydan-2023-12-28-21-13-utc.csv" , "watchlist-mutler-2023-12-28-21-06-utc.csv", out);
}

public static PrintStream output(String m1, String m2, PrintStream file) 
        throws FileNotFoundException {
    Scanner in1 = new Scanner(new File(m1));	
    Scanner in2 = new Scanner(new File(m2));
    file.println("MUST WATCH LIST\n");

    while (in1.hasNext()){
        String line1 = in1.nextLine();
        String movieTitle1 = title(line1);
        String movieYear1 = year(line1);

       while (in2.hasNext()){
            String line2 = in2.nextLine();
            String movieTitle2 = title(line2);
            String movieYear2 = year(line2);
            System.out.print("\nComparing: " + movieTitle1 + " & " + movieTitle2);

            if (movieTitle1.equals(movieTitle2) && movieYear1.equals(movieYear2)){
                System.out.print("\nSame movie: " +movieTitle1 + ": " + movieYear1);
                file.println(movieTitle1 + ": " + movieYear1);
            }
       }
        in2 = new Scanner(new File(m2));
    }
    return file;
}

public static String title(String line){
    String[] movie = line.split(",");
    return movie[1];
}

public static String year(String line){
    String[] movie = line.split(",");
    //String movieTitle = movie[1];
    return movie[2];
}

// public static int amount (){
//     Scanner input = new Scanner(System.in);

//     System.out.print("How many watchlist are you comparing? ");
// 	int amount = input.nextInt();

//     return amount;
// }
}