package org.example.exercice5jee.controlers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice5jee.models.Dog;
import org.example.exercice5jee.service.ChenileService;

import java.io.IOException;
import java.time.LocalDate;
@WebServlet(value = { "/dog/*"})
public class DogServlet extends HttpServlet {
    private ChenileService chenileService = new ChenileService();

    @Override
    public void init() throws ServletException {


    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pathInfo = req.getPathInfo();
        //System.out.println(Integer.parseInt(pathInfo.substring(1)));
        if (pathInfo == null || pathInfo.equals("/")) {
            req.setAttribute("dogs", chenileService.getAllDogs());
            req.getRequestDispatcher("/WEB-INF/dogTabs.jsp").forward(req, resp);
        } else {
            req.setAttribute("dog", chenileService.getDog(Integer.parseInt(pathInfo.substring(1))));
            req.getRequestDispatcher("/WEB-INF/dogForm.jsp").forward(req, resp);
        }

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String birthday = req.getParameter("birthday");
        LocalDate birthdayDate = LocalDate.parse(birthday);
        chenileService.creatdog(name,breed,birthdayDate);
        doGet(req,resp);
    }


}
