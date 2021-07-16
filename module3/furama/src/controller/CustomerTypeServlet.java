package controller;

import service.CustomerTypeService;
import service.CustomerTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerTypeServlet", urlPatterns = "/customerType")
public class CustomerTypeServlet extends HttpServlet {
    private CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }switch (action){
            case "create":
                createCustomerType(request,response);
                break;
            case "search":
                searchCustomerType(request,response);
                break;
            default:
                showCustomerTypeList(response,response);
        }
    }

    private void showCustomerTypeList(HttpServletResponse response, HttpServletResponse response1) {
    }

    private void searchCustomerType(HttpServletRequest request, HttpServletResponse response) {
    }

    private void createCustomerType(HttpServletRequest request, HttpServletResponse response) {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
