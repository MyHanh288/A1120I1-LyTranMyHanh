package controller;

import model.Catalogue;
import model.Product;
import service.CatalogueService;
import service.CatalogueServiceImpl;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    private CatalogueService catalogueService = new CatalogueServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            default:
                showProductList(request,response);
        }

    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("product", productService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/final/list.jsp");
        dispatcher.forward(request, response);
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productid"));
        String productName = request.getParameter("productname");
        int price =Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String catalogueId = request.getParameter("catalogueid");
        Product product = new Product(productId, productName, price, quantity, color, description, new Catalogue(catalogueId));
        productService.save(product);
        showProductList(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showCreateProduct(request, response);
                break;
            
            default:
                showProductList(request, response);
        }
    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productid"));
        List<Catalogue> catalogues = catalogueService.findAll();
        request.setAttribute("catalogues",catalogues);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/final/create.jsp");
        dispatcher.forward(request,response);
    }
}
