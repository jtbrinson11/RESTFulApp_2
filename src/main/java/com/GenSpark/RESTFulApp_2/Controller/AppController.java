package com.GenSpark.RESTFulApp_2.Controller;

import com.GenSpark.RESTFulApp_2.Entity.Airplane;
import com.GenSpark.RESTFulApp_2.Service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private AirplaneService airServ;

    @GetMapping("/")
    public String main()
    {
        return "<HTML><H1>Main page</H1></HTML>";
    }

    @RequestMapping("param")
    public String param(@RequestParam(value = "name", defaultValue = "value") String val, @RequestParam(value = "para", defaultValue = "Paragraph") String para)
    {
        return "This " + val + " " + para;
    }

    @GetMapping("/airplane")
    public List<Airplane> getAirplanes()
    {
        return this.airServ.getAllAirplanes();
    }

    @GetMapping("/airplane/{air}")
    public Airplane getAirplane(@PathVariable String air)
    {
        return this.airServ.getAirplaneByID(Integer.parseInt(air));
    }

    @PostMapping("/airplane")
    public Airplane addAirplane(@RequestBody Airplane plane)
    {
        return this.airServ.addAirplane(plane);
    }

    @PutMapping("/airplane")
    public Airplane updateAirplane(@RequestBody Airplane plane)
    {
        return this.airServ.updateAirplane(plane);
    }

    @PutMapping("/airplane/buy/{air}")
    public String buyAirplane(@PathVariable String air)
    {
        return this.airServ.buyAirplane(Integer.parseInt(air));
    }

    @DeleteMapping("/airplane/{air}")
    public String deleteAirplane(@PathVariable String air)
    {
        return this.airServ.deleteAirplaneByID(Integer.parseInt(air));
    }
}
