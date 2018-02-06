<%@page isELIgnored="false" %>

<h1 style="color:red;align:center" >Book Detail of Given Isbn is:</h1>

<table border="1">
<tr><th>Isbn</th><th>Title</th><th>Author</th><th>Price</th></tr>
<tr><td>${BookData.isbn }</td><td>${BookData.title }</td><td>${BookData.author }</td><td>${BookData.price }</td></tr>



</table>
<a href="input.jsp" >Home</a>