<html>
<body>
    <h2>Welcome to TechAxis WebApp</h2>
    <p>Hello, World! You can navigate to different pages below:</p>

    <ul>
        <!-- Link to the HelloServlet -->
        <li><a href="${pageContext.request.contextPath}/hello">Go to Hello Servlet</a></li>

        <!-- Link to the AnotherPageServlet -->
        <li><a href="${pageContext.request.contextPath}/anotherPage">Go to Another Page</a></li>
    </ul>
</body>
</html>
