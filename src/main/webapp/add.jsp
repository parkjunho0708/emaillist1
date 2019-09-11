<%@page import="kr.co.emaillist.dao.EmaillistDao"%>
<%@page import="kr.co.emaillist.dao.vo.EmaillistVo"%>
<%
		request.setCharacterEncoding("UTF-8");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
	    EmaillistVo vo = new EmaillistVo();
		vo.setFirstname(firstName);
		vo.setLastname(lastName);
		vo.setEmail(email);
	
		new EmaillistDao().insert(vo);
		
		response.sendRedirect(request.getContextPath());
%>