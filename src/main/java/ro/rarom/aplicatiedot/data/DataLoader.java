package ro.rarom.aplicatiedot.data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;
import ro.rarom.aplicatiedot.model.CereriClientiEntity;
import ro.rarom.aplicatiedot.repository.CereriClientiRepository;

import java.util.List;

//@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

  private final CereriClientiRepository repo;

  @Override
  public void run(String... args) throws Exception {
//    Fairy fairy = Fairy.create ();
//
//    repo.saveAll (IntStream.range (0, 100)
//      .mapToObj (index -> fairy.person ())
//      .map (person -> new CereriClientiEntity (person.getFullName (), person.getAge ()))
//      .toList ());
    repo.saveAll (List.of (
      new CereriClientiEntity ("something", 11),
      new CereriClientiEntity ("another", 21),
      new CereriClientiEntity ("something", 4)
    ));
  }
}
