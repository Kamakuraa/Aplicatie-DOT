package ro.rarom.aplicatiedot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.rarom.aplicatiedot.model.CereriClientiEntity;
import ro.rarom.aplicatiedot.repository.CereriClientiRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CereriClientiService {

  private final CereriClientiRepository repository;

  public List<CereriClientiEntity> getAll() {
    return repository.findAll ();
  }

  public CereriClientiEntity addCerere(CereriClientiEntity cerere) {
    return repository.save (cerere);
  }
}
