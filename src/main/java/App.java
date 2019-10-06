import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/")
public class App extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res){

		ServletContext sc = req.getServletContext();
		String path = req.getRequestURI();

		switch(path){
			case "/Projeto/estoque":
				try{
					sc.getRequestDispatcher("/jsp/estoque.jsp").forward(req, res);            
				} catch (Exception e){
					System.out.println(e);
				}
			case "/Projeto/AddProduto":
				try{
					sc.getRequestDispatcher("/jsp/AddProduto.jsp").forward(req, res);            
				} catch (Exception e){
					System.out.println(e);
				}
			case "/Projeto/relatorio":
				try{
					sc.getRequestDispatcher("/jsp/relatorio.jsp").forward(req, res);            
				} catch (Exception e){
					System.out.println(e);
				}
			case "/Projeto/Finalizacao":
				try{
					sc.getRequestDispatcher("/jsp/finalizacao.jsp").forward(req, res);            
				} catch (Exception e){
					System.out.println(e);
				}


			default:
			
	 			try{
					sc.getRequestDispatcher("/jsp/index.jsp").forward(req, res);            
				} catch (Exception e){
					System.out.println(e);
				}
		}
	}	
}



