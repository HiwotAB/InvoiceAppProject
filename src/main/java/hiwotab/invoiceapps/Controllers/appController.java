package hiwotab.invoiceapps.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class appController {

    @GetMapping("/index")
    public String indexDisp(Model model)
    {
        String message="Welcome to Invoice Application";
        model.addAttribute("myMessage", message);
        return "index";
    }
    @GetMapping("/login")
    public String loginDisp(Model model)
    {
        String message="This is the login page";
        model.addAttribute("myMessage", message);
        return "index";
    }
    @GetMapping("/addproduct")
    public String addproductDisp(Model model)
    {
        String message="Add a product here";
        model.addAttribute("myMessage", message);
        return "index";
    }
    @GetMapping("/listproducts")
    public String listproductDisp(Model model)
    {
        String messageOne="This is a list of your products";
        String messageTwo="The dependencies used are:";
        String messageThree="Dependency 1";
        String messageFour="Dependency 2";
        String messageFive="Dependency 3";
        model.addAttribute("myMessageOne", messageOne);
        model.addAttribute("myMessageTwo", messageTwo);
        model.addAttribute("myMessageThree", messageThree);
        model.addAttribute("myMessageFour", messageFour);
        model.addAttribute("myMessageFive", messageFive);
        return "index";
    }

}
