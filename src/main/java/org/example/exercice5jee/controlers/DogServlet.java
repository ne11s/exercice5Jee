package org.example.exercice5jee.controlers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice5jee.models.Dog;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@WebServlet(value ="/dogTabs")
public class DogServlet extends HttpServlet {
    private List<Dog> dogs;
    @Override
    public void init() throws ServletException {
        dogs = new ArrayList<>();
        dogs.add(new Dog("toto", "golden", LocalDate.now()));
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);
        req.getRequestDispatcher("/WEB-INF/dogTabs.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String birthday = req.getParameter("birthday");
        LocalDate birthdayDate = LocalDate.parse(birthday);
        Dog dog = new Dog(name, breed, birthdayDate);
        this.dogs.add(dog);

        doGet(req,resp);
    }


}
