package com.techmex.techmex.Core.Controllers;

import com.techmex.techmex.Core.Services.ICategoriasService;
import com.techmex.techmex.Core.Services.IFormasPagoService;
import com.techmex.techmex.Dtos.CategoriasDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/formasPago")
public class FormasPagoController {
    private final IFormasPagoService formasPagoService;
    @GetMapping("/lista")
    public List<CategoriasDto> listaCategorias(){
            return formasPagoService.get

    }
}
