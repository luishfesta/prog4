<%-- 
    Document   : produtos-lista
    Created on : 14/08/2015, 21:03:55
    Author     : emanoelle.stival
--%>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
        
<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.lojavirtual.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Loja Virtual</h1>
        
        <c:forEach var="produto" items="${produtos}">
            <div>
                <p>${produto.nome}</p>
                <a href="produto-detalhe?id=${produto.id}">
                   <img src="../imagens/0${produto.id}.jpg" 
                     alt="produto"${produto.id} />
                </a>
                     <p>R$ ${produto.preco}</p>
            </div>
        </c:forEach>
            
            
            
        
    </body>
</html>
