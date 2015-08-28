

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Meu Cadastro
        </h1>
        <form action="Cadastro" method="post">
            <label for="PF">Cliente: </label>
            <input type="radio" name="Pessoa" value="PF" id="PF"> PF 
                <input type="radio" name="Pessoa" value="PJ" id="PJ"> PJ
                <p></p>
            <label for="Nome"> Nome: </label>
                <input type="text" name="Nome" id="Nome">
                <p></p>
            <label for="CPF"> CPF: </label>
                <input type="number" name="CPF" id="CPF">
                <p></p>
            <label for="DataNasc"> Data Nascimento: </label>
                <input type="date" name="DataNasc" id="DataNasc">
                <p></p>
            <label for="Sexo"> Sexo: </label>
            <select name="Sexo" id="Sexo">
                <option>Selecione</option>
                <option>Masculino</option>
                <option>Feminino</option>
            </select>   
            <p></p>
            <label for="Comentario"> Comentário </label>
            <textarea name="Comentario" id="Comentario"></textarea>
            <p></p>
            <input type="submit" value="salvar">
        </form>
    </body>
</html>
