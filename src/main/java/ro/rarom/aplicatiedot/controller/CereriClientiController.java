package ro.rarom.aplicatiedot.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import ro.rarom.aplicatiedot.model.CereriClientiEntity;
import ro.rarom.aplicatiedot.service.CereriClientiService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("cereri")
@RequiredArgsConstructor
public class CereriClientiController {

  private final CereriClientiService service;

  @GetMapping
  List<CereriClientiEntity> getAll() {
    return service.getAll ();
  }

  @PostMapping
  CereriClientiEntity addOmologs(@RequestBody CereriClientiEntity entity) {
    return service.addCerere (entity);
  }

  @GetMapping("{cereriId}")
  Optional<CereriClientiEntity> findById(@PathVariable Long cereriId) {
    return service.findById (cereriId);
  }

  @PutMapping("{cereriId}")
  CereriClientiEntity replaceEntity(@RequestBody CereriClientiEntity cereriClienti, @PathVariable Long cereriId) {
    return service.replaceEntity(cereriClienti, cereriId)
      .orElseThrow(() -> new RuntimeException("Could not find cereri with id " + cereriId));
  }

  @DeleteMapping("{cereriId}")
  CereriClientiEntity cereriDelete( @PathVariable Long cereriId ){
    return service.cereriDelete(cereriId);
  }
}
