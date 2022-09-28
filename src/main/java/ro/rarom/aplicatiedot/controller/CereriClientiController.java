package ro.rarom.aplicatiedot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.rarom.aplicatiedot.model.CereriClientiEntity;
import ro.rarom.aplicatiedot.service.CereriClientiService;

import java.util.List;

@RestController
@RequestMapping("cereri")
@RequiredArgsConstructor
public class CereriClientiController {

  private final CereriClientiService service;

  @GetMapping
  List<CereriClientiEntity> getAll(){
    return service.getAll();
  }
  @PostMapping
  CereriClientiEntity addOmologs(@RequestBody CereriClientiEntity omologari){
    return service.addCerere(omologari);
  }
}
