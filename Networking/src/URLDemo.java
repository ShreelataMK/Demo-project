import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("http://www.google.com");
			
			System.out.println("Protocol:"+url.getProtocol());
			
			System.out.println("Host Name:"+url.getHost());
			
			System.out.println("Port Number:"+url.getPort());
			
			System.out.println("Default Port Number:"+url.getDefaultPort());
			
			System.out.println("Path:"+url.getFile());
			
			URL url2 = new URL("http://www.Javatpoint.com");
			
			try {
				URLConnection urlcon = url2.openConnection();
				
				InputStream stream = urlcon.getInputStream();
				
				int i;
				
				while((i=stream.read())!=-1) {
					
					System.out.print((char)i);
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
