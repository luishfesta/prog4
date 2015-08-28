
package br.pucpr.prog4.lojaprodutosOld.controllers;

import br.pucpr.prog4.lojaprodutosOld.models.Pessoa;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ClienteServlet extends HttpServlet {


    


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
            rd.forward(request, response);
    }

    
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            Pessoa pessoa = new Pessoa();
            pessoa.setTipo(request.getParameter("Pessoa"));
            pessoa.setNome(request.getParameter("Nome"));
            String CPFaux;
            CPFaux = request.getParameter("CPF");
            int CPF = Integer.parseInt(CPFaux);
            pessoa.setCPF(CPF);
            pessoa.setSexo(request.getParameter("Sexo"));
            pessoa.setComentario(request.getParameter("Comentario"));
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String dataNascAux = request.getParameter("DataNasc");
            Date dataNasc;
            dataNasc = sdf.parse(request.getParameter("DataNasc"));
            pessoa.setDataNasc(dataNasc);
            
        } catch (ParseException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
    }
}

