<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Inicio de Sesión</title>
</head>
<body>
    <h1>Iniciar Sesión</h1>
    <form action="/imc-app/login" method="POST">
        <label for="username">Nombre de Usuario:</label>
        <input type="text" id="username" name="username" required><br>
        
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br>

        <button type="submit">Ingresar</button>
    </form>
    <c:if test="${not empty error}">
        <p style="color: red">${error}</p>
    </c:if>
    <a href="/imc-app/register">¿No tienes cuenta? Regístrate</a>
</body>
</html>
