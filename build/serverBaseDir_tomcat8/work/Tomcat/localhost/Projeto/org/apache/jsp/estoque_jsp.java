/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.51
 * Generated at: 2019-10-03 10:23:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class estoque_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title> Estoque </title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t</head>\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"index.html\"> Busca </a>\r\n");
      out.write("\t\t\t<a href=\"estoque.html\"> Estoque </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<h2> Estoque</h2>\r\n");
      out.write("\t\t\t<a href=\"relatorio.html\"> Gerar relatÃ³rio </a>\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t\t<th>Produto</th>\r\n");
      out.write("\t\t\t\t\t<th>Quantidade</th>\r\n");
      out.write("\t\t\t\t\t<th>Unidade </th>\r\n");
      out.write("\t\t\t\t\t<th>PreÃ§o</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">DescriÃ§Ã£o</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td> 0 </td>\r\n");
      out.write("\t\t\t\t\t<td> Agua  </td>\r\n");
      out.write("\t\t\t\t\t<td> 4 </td>\r\n");
      out.write("\t\t\t\t\t<td> L </td>\r\n");
      out.write("\t\t\t\t\t<td> 2.50 <td>\r\n");
      out.write("\t\t\t\t\t<td> Ãgua mineral pra voce ficar legal </td>\t\r\n");
      out.write("\t\t\t\t\t<td> <button type=\"button\">Editar</button> </td>\r\n");
      out.write("\t\t\t\t\t<td> <button type=\"button\">Remover</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td> 1 </td>\r\n");
      out.write("\t\t\t\t\t<td> Chocolate  </td>\r\n");
      out.write("\t\t\t\t\t<td> 4 </td>\r\n");
      out.write("\t\t\t\t\t<td> g </td>\r\n");
      out.write("\t\t\t\t\t<td> 2.00 <td>\r\n");
      out.write("\t\t\t\t\t<td> Cioccolata </td>\r\n");
      out.write("\t\t\t\t\t<td> <button type=\"button\">Editar</button> </td>\r\n");
      out.write("\t\t\t\t\t<td> <button type=\"button\">Remover</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<button onclick=\"window.location.href = 'AddProduto.html';\">Adicionar Produto</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
