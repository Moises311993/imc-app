<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro</title>
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
            max-width: 400px;
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

        .input-group input,
        .input-group select {
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

        /* Enlace de inicio de sesión */
        .login-link {
            margin-top: 15px;
        }
        .login-link a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .login-link a:hover {
            text-decoration: underline;
        }

    </style>
    
</head>
<body>
    <div class="container">
        <h1>Registro de Usuario</h1>
        <form action="/imc-app/register" method="POST">
            
            <div class="input-group">
                <label for="fullName">Nombre Completo:</label>
                <input type="text" id="fullName" name="fullName" required>
            </div>

            <div class="input-group">
                <label for="username">Nombre de Usuario:</label>
                <input type="text" id="username" name="username" required>
            </div>

            <div class="input-group">
                <label for="password">Contraseña:</label>
                <input type="password" id="password" name="password" required>
            </div>

            <div class="input-group">
                <label for="passwordConfirm">Confirmar Contraseña:</label>
                <input type="password" id="passwordConfirm" name="passwordConfirm" required>
            </div>

            <div class="input-group">
                <label for="age">Edad:</label>
                <input type="number" id="age" name="age" required>
            </div>

            <div class="input-group">
                <label for="gender">Sexo:</label>
                <select id="gender" name="gender">
                    <option value="masculino">Masculino</option>
                    <option value="femenino">Femenino</option>
                </select>
            </div>

            <div class="input-group">
                <label for="height">Estatura (en metros):</label>
                <input type="number" step="0.01" id="height" name="height" required>
            </div>

            <button type="submit" class="btn">Registrar</button>
        </form>

        <c:if test="${not empty error}">
            <p class="error-message">${error}</p>
        </c:if>

        <p class="login-link">¿Ya tienes cuenta? <a href="/imc-app/login">Inicia sesión</a></p>
    </div>
</body>
</html>