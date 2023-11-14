/**
 * 
 */
package recipes;

import java.util.List;
import java.util.Scanner;

import recipes.dao.DbConnection;

/**
 * 
 */
public class Recipes {
	private Scanner scanner = new Scanner(System.in);
	
	// @formatter:off
	private List<String> operations = List.of(
			
	);
	// @formatter:on
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DbConnection.getConnection();
	}

}
