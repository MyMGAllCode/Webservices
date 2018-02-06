<%@page isELIgnored="false"%>
<table border="1" style="border-bottom-color: green;">

<tr><th>Bank Name</th><th>Interest Rate </th><th>Amount </th><th>Time in Months </th><th>EMI</th></tr>
<tr><td>${details.bank}</td><td>${details.interestrate}</td><td>${details.amt}</td><td>${details.time}</td><td>${details.emi}</td></tr>

</table>
<a href="pages/index.jsp" style="font-style: italic;color: green;font-size: 16;font-family: inherit;">Home</a>
