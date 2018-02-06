<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<body background="pink">
	<div align="center"
		style="width: 100%; height: 100%; border: thin solid greeen; background-color: gray;">
		<h1 style="text-align: center; font-family: serif; font-size: medium;">Welcome
			to EMI Calculator Application</h1>
		<div align="center"
			style="width: 500px; height: 500px; border: thin solid greeen; background-color: gray;">
			
			<form action="getemi" method="post">
			Choose Bank:<select name="bank">
			<option>Select Bank</option>
			<option>ICICI</option>
			<option>Axis</option>
			
			</select></br>
				Enter Ammount: <input  type="text" name="amt""/> </br> 
				Enter Duratiom in month<select
					name="time">
				
						<c:forEach begin="1" end="72" varStatus="loop">
						<option>	<c:out value="${loop.count}" /></option>
						</c:forEach>
					

				</select>
<input type="submit" value="Get EMI Detail"> 

			</form>

		</div>
		<div></div>


	</div>

</body>


</html>