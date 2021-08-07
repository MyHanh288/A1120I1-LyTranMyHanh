package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CustomerService;
import service.CustomerServiceImpl;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }

    @GetMapping("/customer/create")
    public String showCreate(Model model) {
        model.addAttribute("customers", new Customer());
        return "/create";

    }


    @PostMapping("/customer/save")
    public String save(Customer customer, Model model) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/customer/edit")
    public String showEdit(@RequestParam Integer id, Model model) {
        model.addAttribute("customers", customerService.findById(id));
        return "/edit";
    }

    @PostMapping("/customer/edit")
    public String editCustomer(@RequestParam Integer id, Customer customer, RedirectAttributes redirect) {
        customerService.update(id, customer);
        redirect.addFlashAttribute("message", "You are successed to edit: " + customer.getName());
        return "redirect:/";
    }

    @GetMapping("customer/delete")
    public String deleteCustomer(@RequestParam Integer id, Customer customer, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("delete", "You are successed to delete");
        return "redirect:/";
    }

    @GetMapping("customer/view")
    public String viewCustomer(@RequestParam Integer id, Model model) {
        model.addAttribute("customers", customerService.findById(id));
        return "/view";
    }

}
