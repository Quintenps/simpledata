package guestfunctions;

import dao.datastoreDAO;
import dao.userDAO;
import platform.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by 187z on 6/6/2016.
 */
public class LoginServlet extends HttpServlet {
    private dao.userDAO userdao;
    private dao.datastoreDAO datastore;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        RequestDispatcher rd = req.getRequestDispatcher("/portal/index.jsp");

        // check if users not null or empty

        User u = new User(username,password);

        if(userdao.isRegistered(u)){
            req.getSession().setAttribute("loggedUser", u);
            req.getSession().setAttribute("uid", userdao.getUID(u));
            u.setUID(userdao.getUID(u));

            System.out.println("User "+u.getUsername()+" / UID: "+userdao.getUID(u));
            System.out.println("Succesfully logged in!");
        }

        else {
            req.setAttribute("headermsg","Error");
            req.setAttribute("bodymsg","Incorrect username and or password.");
            req.setAttribute("status","negative"); rd = req.getRequestDispatcher("/login.jsp"); }

        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        userdao = new userDAO();
        datastore = new datastoreDAO();

    }
}