/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/leonardo"})
public class App extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res){
		try{
			PrintWriter pw = res.getWriter();
			pw.write("<h1>Build com gradleee</h1>");
			pw.close();
		} catch (Exception e){
			System.out.println("Erro");
		}
	} 
}
