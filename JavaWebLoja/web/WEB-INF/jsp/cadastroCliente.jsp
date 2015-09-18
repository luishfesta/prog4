<%-- 
    Document   : cadastroCliente
    Created on : 28/08/2015, 19:54:31
    Author     : jonhy.haniu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Meu Cadastro</h1>
        <form action="cadastro" method="POST">
            <label for="pessoa">Pessoa Fisica</label><input type="radio" name="pessoa" value="pessoaFisica" id="pessoa">
            <label for="pessoa">Pessoa Juridica</label><input type="radio" name="pessoa" value="pessoaJuridica" id="pessoa"></br>            
            <label for="nome">Nome Completo</label><input type="text" name="name" id="nome"></br>
            <label for="cpf">CPF</label><input type="text" name="cpf" id="cpf"></br>
            <label for="datanasc">Data de Nascimento</label><input type="text" name="dataNasc" id="datanasc"></input></br>            
            <select name="sex">
                <option>
                    Feminino
                </option>
                <option>
                    Masculino
                </option>
            </select></br>
            <input type="submit" name="enviar"></input>
        </form>
        
    </body>
</html>
