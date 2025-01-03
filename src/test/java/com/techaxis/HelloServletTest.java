package com.techaxis;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.Mockito.*;

public class HelloServletTest {

    private HelloServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private PrintWriter writer;

    @BeforeEach
    public void setUp() throws IOException {
        servlet = new HelloServlet();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        writer = mock(PrintWriter.class);

        when(response.getWriter()).thenReturn(writer);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        servlet.doGet(request, response);
        verify(writer).write("<h1>Hello DevOps</h1><p>Welcome to the TechAxis DevOps Class!</p>");
    }
}
