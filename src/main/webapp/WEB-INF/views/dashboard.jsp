<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Panel Principal</title>
    <style>
       
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 20px;
        }

        /* Encabezados */
        h1 {
            color: #333;
            margin-bottom: 10px;
        }

        h2 {
            color: #555;
            margin-top: 20px;
        }

        /* Formulario */
        form {
            background: #fff;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            display: inline-block;
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        input[type="number"] {
            width: 80%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
        }

        button {
            background: #007bff;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background: #0056b3;
        }

        /* Tabla de historial */
        table {
            width: 60%;
            margin: 20px auto;
            border-collapse: collapse;
            background: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }

        th {
            background: #007bff;
            color: white;
        }

        tr:nth-child(even) {
            background: #f9f9f9;
        }

        /* Link de cierre de sesión */
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
        }

        a:hover {
            color: #0056b3;
        }

    </style>
</head>
<body>
    <h1>Bienvenido, ${usuario}</h1>
    <form action="/imc-app/dashboard" method="POST">
        <label for="weight">Peso (kg):</label>
        <input type="number" id="weight" name="weight" required><br>
        <button type="submit">Calcular IMC</button>
    </form>

    </script>
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
