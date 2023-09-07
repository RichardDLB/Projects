package com.calculator.radio.button.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            String operacion = request.getParameter("operacion");
            double nro1 = Double.parseDouble(request.getParameter("nro1"));
            double nro2 = Double.parseDouble(request.getParameter("nro2"));            
            // localhost:8082/calculator?operacion=sumar&nro1=4&nro2=9
            switch (operacion) {
                case "sumar":   out.println(nro1 + nro2); break;
                case "restar":  out.println(nro1 - nro2); break;
                case "multiplicar": out.println(nro1 * nro2); break;
                case "dividir":
                    if (nro2 != 0) {
                        out.println(nro1 / nro2);
                    } else {
                        out.println("Error /0");
                    }
                    break;
                default:
                    out.println("Operación incorrecta!");
                    out.println("operacion solo es permitido sumar - restar - dividir - multiplicar");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
