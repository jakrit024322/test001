package nvc.it.test0001.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.it.test0001.model.Book;
import nvc.it.test0001.model.Category;
import nvc.it.test0001.model.Customer;
import nvc.it.test0001.repository.BookPepository;
import nvc.it.test0001.repository.CategoryRepository;
import nvc.it.test0001.service.CustomerService;

@Controller
public class MainController {
    
    @Autowired
    CustomerService customerService;

    @Autowired
    BookPepository bookPepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/customer")
    public ModelAndView customer(){
        List<Customer> customers = customerService.findAll();
        return new ModelAndView("customer","customers",customers);
    }  

    @GetMapping("/customer/{id}")
    public ModelAndView getCustomerById(@PathVariable int id){
        Customer customers = customerService.getById(id);
        return new ModelAndView("customer","customers",customers);
    }


    @GetMapping("/book")
    public ModelAndView book(){
        List<Book> books = bookPepository.findAll();
        return new ModelAndView("book","books",books);
    }

    @GetMapping("/category")
    public ModelAndView category(){
        List<Category> categorys = categoryRepository.findAll();
        return new ModelAndView("category","categorys",categorys);
    }
}
