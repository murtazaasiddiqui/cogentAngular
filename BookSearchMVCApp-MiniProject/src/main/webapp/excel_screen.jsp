<%@ page isELIgnored="false" import="java.util.*,com.murtaza.dto.BookDetailsDTO"%>

<%
	//make this response as a downloadable ms-excel file
	response.setContentType("application/vnd.ms-excel");
	response.addHeader("Content-Disposition","attachment;fileName=books_index.xls");
	
	//read results from request scope
	List<BookDetailsDTO>list=(List<BookDetailsDTO>)request.getAttribute("bookList");
	String category =request.getParameter("category");
	
	if(list!=null&&list.size()!=0){%>
	<h1 style="color:red;text-align:center">Book Belonging to<%=category %>Category</h1>
	<table border="1" align="center" bgcolor="cyan">
	<tr>
	<th>BookId</th><th>BookName</th><th>Category</th><th>Author</th><th>Price</th><th>Status</th>
</tr>
<%
for(BookDetailsDTO dto:list){ %>
<tr>
<td><%=dto.getBookId()%></td>
<td><%=dto.getBookName()%></td>
<td><%=dto.getCategory()%></td>
<td><%=dto.getAuthor()%></td>
<td><%=dto.getPrice()%></td>
<td><%=dto.getStatus()%></td>
</tr>
<% }//for
%>
</table>
<br>
<% }//if
else{ %>
<h1 style="color:red;text-align:center">Records not found</h1>
<% }
%>