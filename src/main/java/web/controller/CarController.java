package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.ReturnCars;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CarController {

    @Autowired
    private ReturnCars returnCars;

    @GetMapping("/cars")
    public String carGet(HttpServletRequest request, ModelMap model){
        String b = request.getParameter("count");
        Integer a = 0;
        if (b != null ) {
        a = Integer.parseInt(b);
        }
        model.addAttribute("cars", returnCars.returnCarsByNumber(a));
        return "cars";
    }


}
