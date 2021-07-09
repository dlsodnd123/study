<%@ tag language="java" body-content="scriptless" pageEncoding="UTF-8"%>

<%@ attribute name="title" required="true" %>
<%@ attribute name="color" required="true" %>

<p>
	<table border="1">
		<tr>
			<th>${title}</th>
		</tr>
		<tr>
			<td bgcolor="${color}"><jsp:doBody /></td>
		</tr>
	</table>
</p>
