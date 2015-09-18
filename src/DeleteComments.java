import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class DeleteComments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		Writer writer = null;

		try {
			
			 

			String sCurrentLine;
			 String REGEX = "(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)";
			
		    File inputFile = new File("C:\\Users\\Orxan\\Desktop\\JavaFiles\\anar.txt");
			br = new BufferedReader(new FileReader(inputFile));
			
			
			 File outputFile = new File("C:\\Users\\Orxan\\Desktop\\JavaFiles\\output.txt");
			 outputFile.createNewFile(); 
			 
			 writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream(outputFile), "utf-8"));
			   

			 

			while ((sCurrentLine = br.readLine()) != null) {
				
				
			     String REPLACE = "";

		
			       Pattern p = Pattern.compile(REGEX);
			       // get a matcher object
			       Matcher m = p.matcher(sCurrentLine); 
			       sCurrentLine = m.replaceAll(REPLACE);
			       System.out.println(sCurrentLine);
			       writer.write(sCurrentLine + "\n");
			
			}  

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}


	}
	/*public class writer {
	    public void writing() {
	        try {
	            //Whatever the file path is.
	            File statText = new File("D:\Java\Workspace\EdocWebNew\YusifInterview\output.txt");
	            FileOutputStream is = new FileOutputStream(statText);
	            OutputStreamWriter osw = new OutputStreamWriter(is);    
	            Writer w = new BufferedWriter(osw);
	            w.write(sCurrentLine);
	            w.close();
	        } catch (IOException e) {
	            System.err.println("Problem writing to the file output.txt");
	        }
	    }
	} */ 
	
}
