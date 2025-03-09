<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Panel Principal</title>
</head>
<body>
    <h1>Bienvenido, ${usuario}</h1>
    <form action="/imc-app/dashboard" method="POST">
        <label for="peso">Peso (kg):</label>
        <input type="number" id="peso" name="peso" required><br>
        <button type="submit">Calcular IMC</button>
    </form>

    <h2>Historial de IMC</h2>
    <table>
        <thead>
            <tr>
                <th>Fecha</th>
                <th>IMC</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="registry" items="${IMCHistory}">
                <tr>
                    <td>${registry.date}</td>
                    <td>${registry.imcValue}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <a href="/imc-app/logout">Cerrar sesión</a>
</body>
</html>
