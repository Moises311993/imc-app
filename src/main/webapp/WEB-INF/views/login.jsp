<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Inicio de Sesión</title>
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
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 350px;
            margin: auto;
        }

        /* Encabezado */
        h1 {
            color: #333;
        }

        /* Grupos de input */
        .input-group {
            margin-bottom: 15px;
            text-align: left;
        }

        .input-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        .input-group input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        /* Botón */
        .btn {
            display: inline-block;
            background: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        .btn:hover {
            background: #0056b3;
        }

        /* Mensaje de error */
        .error-message {
            color: red;
            font-weight: bold;
            margin-top: 10px;
        }

        /* Enlace de registro */
        .register-link {
            margin-top: 15px;
        }
        .register-link a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .register-link a:hover {
            text-decoration: underline;
        }

    </style>
</head>
<body>
    <div class="container">
        <h1>Iniciar Sesión</h1>
        <form action="/imc-app/login" method="POST">
            <div class="input-group">
                <label for="username">Nombre de Usuario:</label>
                <input type="text" id="username" name="username" required>
            </div>
            
            <div class="input-group">
                <label for="password">Contraseña:</label>
                <input type="password" id="password" name="password" required>
            </div>

            <button type="submit" class="btn">Ingresar</button>
        </form>

        <c:if test="${not empty error}">
            <p class="error-message">${error}</p>
        </c:if>

        <p class="register-link">
            ¿No tienes cuenta? <a href="/imc-app/register">Regístrate</a>
        </p>
    </div>
</body>
</html>
