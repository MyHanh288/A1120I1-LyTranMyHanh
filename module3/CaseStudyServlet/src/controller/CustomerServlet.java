package controller;

import model.Customer;
import model.CustomerType;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.CustomerTypeService;
import service.CustomerTypeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    private CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "search":
                searchCustomer(request,response);
                break;
            default:
                showCustomerList(request,response);
        }
    
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customer", customerService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerName = request.getParameter("CustomerName");
        request.setAttribute("customer",customerService.findByName(customerName));
        request.setAttribute("search", customerName);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request,response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showCustomerList(request,response);
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int customerId1 = Integer.parseInt(request.getParameter("CustomerId"));
        String customerName = request.getParameter("CustomerName");
        String customerBir =  request.getParameter("CustomerBir");
        String gender = request.getParameter("Gender");
        int cusIdNum =Integer.parseInt(request.getParameter("CusIdNum"));
        int cusTelNum = Integer.parseInt(request.getParameter("CusTelNum"));
        String cusEmail = request.getParameter("CusEmail");
        String address = request.getParameter("Address");
        String customerTypeId = request.getParameter("CustomerTypeId");
        System.out.println("id đang chinh la L" + customerId1);
        Customer customer = new Customer(customerName,customerBir,gender,cusIdNum,cusTelNum,cusEmail,address, new CustomerType(customerTypeId));
        customerService.update(customerId1,customer);
        showCustomerList(request,response);

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int customerId = Integer.parseInt(request.getParameter("CustomerId"));

        String customerName = request.getParameter("CustomerName");
        System.out.println("them mới id"+ customerName);
        String customerBir =  request.getParameter("CustomerBir");
        String gender = request.getParameter("Gender");
        int cusIdNum =Integer.parseInt(request.getParameter("CusIdNum"));
        int cusTelNum = Integer.parseInt(request.getParameter("CusTelNum"));
        String cusEmail = request.getParameter("CusEmail");
        String address = request.getParameter("Address");
        String customerTypeId = request.getParameter("CustomerTypeId");
        System.out.println("them mới id"+ customerName);
        Customer customer = new Customer(customerName,customerBir,gender,cusIdNum,cusTelNum,cusEmail,address, new CustomerType(customerTypeId));
        customerService.save(customer);
        showCustomerList(request,response);
        System.out.println("them mới"+ customer);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
            case "edit":
                showEditCustomer(request, response);
                break;
            case "delete":
                showDeleteCustomer(request, response);
                break;
            case "search":
                showSearchCustomer(request, response);
                break;
            case "view":
                showViewCustomer(request, response);
                break;
            default:
                showCustomerList(request, response);
        }
    }

    private void showViewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("CustomerId"));
        request.setAttribute("customer",customerService.findById(customerId));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/view.jsp");
        dispatcher.forward(request,response);
    }

    private void showSearchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerName = request.getParameter("CustomerName");
        request.setAttribute("customer",customerService.findByName(customerName));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showDeleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("id"));
        customerService.remove(customerId);
        System.out.println("id xoa là " + customerId);
        showCustomerList(request,response);

//        request.setAttribute("customer",customerService.findAll());
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
//        dispatcher.forward(request,response);
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("id"));
//        List<CustomerType> customerTypes = customerTypeService.findAll();
        request.setAttribute("customerTypes", customerTypeService.findAll());
        request.setAttribute("customer",customerService.findById(customerId));
//        Customer customer = customerService.findById(customerId);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/customer/edit.jsp");
        dispatcher.forward(request,response);
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int customerId = Integer.parseInt(request.getParameter("CustomerId"));
//        List<CustomerType> customerTypes = customerTypeService.findAll();
        request.setAttribute("customerTypes",customerTypeService.findAll());
        RequestDispatcher dispatcher= request.getRequestDispatcher("/customer/create.jsp");
        dispatcher.forward(request,response);
        System.out.println("customerTypes" + customerTypeService.findAll());
    }
}
