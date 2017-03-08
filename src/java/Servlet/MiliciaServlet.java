package Servlet;

import ejercito.Ejercito;
import ejercito.ElfoFabrica;
import ejercito.EnanoFabrica;
import ejercito.HechizeroFabrica;
import ejercito.HombreFabrica;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MiliciaServlet", urlPatterns = {"/MiliciaServlet"})
public class MiliciaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //MiliciaServlet milicia = new MiliciaServlet();
            String nombre = request.getParameter("gender");
            //String mer = milicia.
            //request.getSession().setAtribute("saludo", saludo
            //response.sendRedirect("Accion.jsp");
            switch (nombre) {
                case "hombre":
                    Ejercito h = new HombreFabrica();
                    request.getSession().setAttribute("cuerpo", h.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", h.darArmadura().Armadura());
                   request.getSession().setAttribute("cuerpo2", h.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", h.darEscudo().Escudo());
                    response.sendRedirect("lienzo.jsp?cuerpo=" + h.darArma().Arma());
                     
                    break;
                case "elfo":
                    Ejercito e = new ElfoFabrica();
                    request.getSession().setAttribute("cuerpo", e.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", e.darArmadura().Armadura());
                   request.getSession().setAttribute("cuerpo2", e.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", e.darEscudo().Escudo());
                    response.sendRedirect("lienzo.jsp?cuerpo=" + e.darArma().Arma());
                     
                    break;
                case "enano":
                    Ejercito en = new EnanoFabrica();
                    request.getSession().setAttribute("cuerpo", en.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", en.darArmadura().Armadura());
                   request.getSession().setAttribute("cuerpo2", en.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", en.darEscudo().Escudo());
                    response.sendRedirect("lienzo.jsp?cuerpo=" + en.darArma().Arma());
                     
                    break;
                case "hechizero":
                    Ejercito he = new HechizeroFabrica();
                    request.getSession().setAttribute("cuerpo", he.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", he.darArmadura().Armadura());
                   request.getSession().setAttribute("cuerpo2", he.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", he.darEscudo().Escudo());
                    response.sendRedirect("lienzo.jsp?cuerpo=" + he.darArma().Arma());
                     
                    break;
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
