package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import model.Usuario;
import modeldao.UsuarioDAO;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath());
      out.write("/css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"pos-f-t\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("                <a class=\"navbar-toggler\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    Home\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <a style=\"color:white\" href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Cerrar Sesion</a>\n");
      out.write("                    <div class=\"dropdown-menu\" text-center>\n");
      out.write("                        <a>User</a>\n");
      out.write("                        <a class=\"dropdown-divider\"></a>\n");
      out.write("                        <a class=\"dropdown-item\">Salir</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1 class=\"display-1\">Listado</h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-dark\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">#</th>\n");
      out.write("                        <th scope=\"col\">Usuario</th>\n");
      out.write("                        <th scope=\"col\">Password</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        UsuarioDAO dao = new UsuarioDAO();
                        List<Usuario> list = dao.listar();
                        Iterator<Usuario> iterador = list.iterator();
                        Usuario user = null;

                        while (iterador.hasNext()) {
                            user = iterador.next();
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">1</th>\n");
      out.write("                        <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getNombre());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getPassword());
      out.write("</td>\n");
      out.write("                        <td><a type=\"button\" class=\"btn btn-success\" href=\"controller?accion=editar&id_usuario=");
      out.print( user.getId());
      out.write("\">Editar</a>\n");
      out.write("                            <a type=\"button\" class=\"btn btn-danger\" href=\"controller?accion=eliminar&id_usuario=");
      out.print( user.getId());
      out.write("\">Eliminar</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
