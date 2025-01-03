package com.techaxis;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class AnotherPageServletTest {

    private AnotherPageServlet servlet;
    private HttpServletRequest mockRequest;
    private HttpServletResponse mockResponse;

    @BeforeEach
    void setUp() {
        servlet = new AnotherPageServlet();
        mockRequest = mock(HttpServletRequest.class);
        mockResponse = mock(HttpServletResponse.class);
    }

    @Test
    void testDoGet() throws Exception {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        when(mockResponse.getWriter()).thenReturn(printWriter);

        servlet.doGet(mockRequest, mockResponse);

        verify(mockResponse).setContentType("text/html");
        printWriter.flush();
        String responseContent = stringWriter.toString();
        assertEquals("<h1>Hello DevSecOps</h1><p>Welcome to the TechAxis DevSecOps Class!</p>", responseContent);
    }
}
