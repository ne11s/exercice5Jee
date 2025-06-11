package org.example.exercice5jee.controlers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice5jee.models.Dog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DogServlet extends HttpServlet {
    private List<Dog> dogs;
    @Override
    public void init() throws ServletException {
        dogs = new ArrayList<>();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);
        req.getRequestDispatcher("/WEB-INF/dogtabs.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        doGet(req,resp);
    }


}
