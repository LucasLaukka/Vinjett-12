package HuvudKod;

public class Main {

	public static void main(String[] args) {

		String[] names = new String[7];
		
		names[0] = "Lucas";
		names[1] = "Hanna";
		names[2] = "Mattias";
		names[3] = "Noa";
		names[4] = "Clara";
		names[5] = "Amitis";
		names[6] = "Jocke";
	
		
		
		for (int i = 0 ; i < names.length ; i++) {
			System.out.println( (i + 1) + ". " + names[i]);
			System.out.println();
		}
		
		System.out.println("Den h�r filen ska vara �ndrad nu, och ligga i branch1");	
		//"�nnu en �ndring bara f�r att se vad som h�nder"

	}

}
