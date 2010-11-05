<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />

<title>(RJ) Welcome</title>
</head>
<body>
<%@include file="body-header.jspf" %>

<h2>Welcome</h2>

<table class="grid">
<tr><th colspan="2" scope="colgroup">Links</th></tr>
<tr><td>WalWare.de OpenSource</td><td><a href="http://www.walware.de/goto/opensource">www.walware.de/goto/opensource</a></td></tr>
<tr><td>R-Project</td><td><a href="http://www.r-project.org">www.r-project.org</a></td></tr>
</table>

<table class="grid">
<tr><th colspan="2" scope="colgroup">Sources</th></tr>
<tr><td>RJ Base</td><td><a href="http://github.com/walware/rj">github.com/walware/rj</a></td></tr>
<tr><td>RJ Services</td><td><a href="http://github.com/walware/rj">github.com/walware/rj-services</a></td></tr>
</table>

<hr/>

<p>
Copyright (c) 2007-2010 WalWare/RJ-Project (www.walware.de/goto/opensource) contributors
and others.</p>
<p>
This product includes software developed by The Apache Software Foundation
(<a href="http://www.apache.org">www.apache.org</a>).</p>

<%@include file="body-footer.jspf" %>
</body>
</html>
</f:view>