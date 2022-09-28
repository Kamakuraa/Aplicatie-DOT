package ro.rarom.aplicatiedot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.rarom.aplicatiedot.entity.OmologariEntity;
import ro.rarom.aplicatiedot.repository.OmologariRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OmologariService {

  private final OmologariRepository repository;

  public List<OmologariEntity> getAll() {
    return repository.findAll ();
  }

  public OmologariEntity addOmologs(OmologariEntity omologari) {
    return repository.save (omologari);
  }
}
