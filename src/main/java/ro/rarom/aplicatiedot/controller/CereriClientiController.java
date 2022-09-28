package ro.rarom.aplicatiedot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.rarom.aplicatiedot.entity.OmologariEntity;
import ro.rarom.aplicatiedot.service.OmologariService;

import java.util.List;

@RestController
@RequestMapping("omologs")
@RequiredArgsConstructor
public class OmologariController {

  private final OmologariService service;

  @GetMapping
  List<OmologariEntity> getAll(){
    return service.getAll();
  }
  @PostMapping
  OmologariEntity addOmologs(@RequestBody OmologariEntity omologari){
    return service.addOmologs(omologari);
  }
}
