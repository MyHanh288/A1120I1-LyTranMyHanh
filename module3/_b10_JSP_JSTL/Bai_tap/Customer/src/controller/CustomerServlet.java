package controller;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    private static List<Customer> customerList;
    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Van Hoan", "1983-08-20","Ha Noi","avatar1.jpg"));
        customerList.add(new Customer("Nguyen Van Nam", "1983-08-21","Bac Giang","avatar2.jpg"));
        customerList.add(new Customer("Nguyen Thai Hoa", "1983-08-22","Nam Dinh","avatar3.jpg"));
        customerList.add(new Customer("Tran Dang Khoa", "1983-08-17","Ha Tay","avatar4.png"));
        customerList.add(new Customer("Nguyen Dinh Thi", "1983-08-19","Ha Noi","avatar5.jpg"));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request,response);
    }
}
