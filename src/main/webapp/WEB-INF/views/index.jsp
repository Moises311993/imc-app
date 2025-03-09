<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Página de Inicio</title>
    <style>
        
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 50px;
        }

        /* Contenedor principal */
        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: auto;
        }

        /* Encabezado */
        h1 {
            color: #333;
        }

        /* Botones */
        .buttons {
            margin-top: 20px;
        }

        .btn {
            display: inline-block;
            background: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            margin: 5px;
            font-weight: bold;
        }

        .btn:hover {
            background: #0056b3;
        }

    </style>
</head>
<body>
    <div class="container">
        <h1>Bienvenido a la Aplicación de IMC</h1>
        <p>Calcula tu Índice de Masa Corporal (IMC) y lleva un seguimiento de tu salud.</p>
        <div class="buttons">
            <a href="/imc-app/login" class="btn">Iniciar sesión</a>
            <a href="/imc-app/register" class="btn">Registrarse</a>
        </div>
    </div>
</body>
</html>