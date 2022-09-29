package ro.rarom.aplicatiedot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.rarom.aplicatiedot.model.CereriClientiEntity;
import ro.rarom.aplicatiedot.repository.CereriClientiRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CereriClientiService {

  private final CereriClientiRepository repository;

  public List<CereriClientiEntity> getAll() {
    return repository.findAll ();
  }

  public CereriClientiEntity addCerere(CereriClientiEntity cerere) {
//    System.out.println (cerere);
    return repository.save (cerere);
  }

  public Optional<CereriClientiEntity> findById(Long cereriId) {
    return repository.findById (cereriId);
  }

  public Optional<CereriClientiEntity> replaceEntity(CereriClientiEntity cereriClienti, Long cereriId) {
    return repository.findById (cereriId)
      .map (dbCereri -> patchCereri (dbCereri, cereriClienti))
      .map (repository::save);
  }

  private CereriClientiEntity patchCereri(CereriClientiEntity dbCereri, CereriClientiEntity cereriClienti) {
    dbCereri.setBeneficiarId (cereriClienti.getBeneficiarId ());
    dbCereri.setCertificatExtindere (cereriClienti.getCertificatExtindere ());
    dbCereri.setSolicitareIncercari (cereriClienti.getSolicitareIncercari ());
    dbCereri.setTipOmologare (cereriClienti.getTipOmologare ());
    dbCereri.setMetodaPlata (cereriClienti.getMetodaPlata ());
    dbCereri.setMetodaPlata (cereriClienti.getMetodaPlata ());
    dbCereri.setStareCerere (cereriClienti.getStareCerere ());
    dbCereri.setDosarId (cereriClienti.getDosarId ());
    dbCereri.setTipCerere (cereriClienti.getTipCerere ());
    dbCereri.setTipCompletare (cereriClienti.getTipCompletare ());

    return dbCereri;
  }

  public CereriClientiEntity cereriDelete(Long cereriId) {
    Optional<CereriClientiEntity> cereri = repository.findById(cereriId);
    cereri.ifPresent(repository::delete);
    return cereri.orElse(null);
  }
}
