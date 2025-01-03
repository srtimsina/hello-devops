package com.techaxis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class ApiServletTest {

    private ApiServlet apiServlet;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @BeforeEach
    void setUp() {
        apiServlet = new ApiServlet();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
    }

    @Test
    void testServletIsNotNull() {
        assertNotNull(apiServlet);
    }

    @Test
    void testDoGet() throws Exception {
        PrintWriter writer = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);

        apiServlet.doGet(request, response);

        String expectedJson = "{\"message\":\"Hello from TechAxis!\",\"status\":\"success\"}";
        verify(writer).write(expectedJson);
    }
}
