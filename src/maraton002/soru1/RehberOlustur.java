package maraton002.soru1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class RehberOlustur {

	public static void main(String[] args) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("rehber.txt", true))) {

			writer.write("Ali Kaya; Ankara; 3123334455\n");
			writer.write("Seher Özkan; İstanbul; 2123236577\n");
			writer.write("Ahmet Genç; İzmir; 2162223344\n");
			writer.write("Ali Öncü; Ankara; 5353222288");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
