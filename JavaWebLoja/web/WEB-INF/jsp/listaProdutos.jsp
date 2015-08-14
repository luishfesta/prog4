
<%@page import="br.pucpr.prog4.lojaprodutosOld.models.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTA DE PRODUTOS </h1>
        <%
            List<Produto> produtos;
            produtos = (List<Produto>) request.getAttribute("produtos");
            
            for (Produto produto : produtos)
            {
            %>
        <div>
            <p><%=produto.getNome()%></p>
            <a href="produto-detalhe?id1=<%=produto.getId()%>" >
                <img src="../../Imagens/Imagem0<%=produto.getId()%>.jpg"
                     alt="produto <%=produto.getId()%>"/>
            </a>
            <p>R$ <%=produto.getPreço()%></p>
        </div>
            <%
            } 
                %>
    </body>
</html>
