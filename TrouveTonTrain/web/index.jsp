<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 30/01/2020
  Time: 08:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="ServletPost" method="post">
  Ville de départ:<input type="text" name="villeDepart"/><br/>
  Ville d'arrivée:<input type="text" name="villeArrivee"/><br/>
  Date de départ :<input type="text" name="heureDepart"/><br/>
  Heure de départ :<input type="text" name="heureArrivee"/><br/>
  Devise:<input type="text" name="devise"/><br/>
  <input type="submit" value="ServletPost"/>
</form>
</body>
</html>

