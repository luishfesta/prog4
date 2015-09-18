/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojavirtual.controllers;

import br.pucpr.prog4.lojavirtual.models.IProdutoManager;
import br.pucpr.prog4.lojavirtual.models.Produto;
import br.pucpr.prog4.lojavirtual.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emanoelle.stival
 */
public class ProdutoListaServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LojaVirtual</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LojaVirtual at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        IProdutoManager manager;
        manager = new ProdutoManager();
        List<Produto> produtos;
        produtos = manager.obterTodos();
        
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produtos-lista.jsp");
        rd.forward(request, response);
    }

    

}
