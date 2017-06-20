package srp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductsFromFile {
	List<Product> products=new ArrayList<Product>();
	public  List<Product> readFile(File file) throws IOException // @02C
	{
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line=br.readLine())!=null){
			String[] data = line.split(" ");
			products.add(new Product(data[0], data[1]));
			}
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		} finally {
			br.close();
		}
		return products;
	}
}
