package pe.vallegrande.institucion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.vallegrande.institucion.DTO.institucionDTO;

@RestController
public class PruebaController {

    @GetMapping("/prueba")
    public institucionDTO obtenerDatosInstitucion() {
       return new institucionDTO(20169004359l, "Universidad nacional de ingieneria", "estudiante@uni.edu.pe");
}
}