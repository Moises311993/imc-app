<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro</title>
</head>
<body>
    <h1>Registro de Usuario</h1>
    <form action="/imc-app/register" method="POST">
        <label for="fullName">Nombre Completo:</label>
        <input type="text" id="fullName" name="fullName" required><br>
        
        <label for="username">Nombre de Usuario:</label>
        <input type="text" id="username" name="username" required><br>
        
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="passwordConfirm">Confirmar Contraseña:</label>
        <input type="password" id="passwordConfirm" name="passwordConfirm" required><br>

        <label for="edad">Edad:</label>
        <input type="number" id="edad" name="edad" required><br>

        <label for="gender">Sexo:</label>
        <select id="gender" name="gender">
            <option value="masculino">Masculino</option>
            <option value="femenino">Femenino</option>
        </select><br>

        <label for="height">Estatura (en metros):</label>
        <input type="number" step="0.01" id="height" name="height" required><br>

        <button type="submit">Registrar</button>
    </form>
    <a href="/imc-app/login">Ya tengo cuenta</a>
</body>
</html>
