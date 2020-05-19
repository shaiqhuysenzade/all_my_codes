<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>
<table border="1">
    <tbody>
        <#list people as person>
        <tr>
            <td>${person.name}</td>
            <td>${person.surname}</td>
            <td>${person.age}</td>
        </tr>
        </#list>
    </tbody>
</table>
<#--<#list name as name>-->
<#--<h3>Hello ${name}</h3>-->

<#--</#list>-->
</body>

</html>