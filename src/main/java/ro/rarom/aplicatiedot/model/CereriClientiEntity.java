package ro.rarom.aplicatiedot.model;

import lombok.*;
import ro.rarom.aplicatiedot.model.enums.MetodaPlata;
import ro.rarom.aplicatiedot.model.enums.StareCerere;
import ro.rarom.aplicatiedot.model.enums.TipCerere;
import ro.rarom.aplicatiedot.model.enums.TipCompletare;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dot_cereri_clienti")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CereriClientiEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int beneficiarId;
  private String certificatExtindere;

  private int solicitareIncercari;

  private String tipOmologare;

  private MetodaPlata metodaPlata;

  private StareCerere stareCerere;

  private int dosarId;

  private LocalDateTime dataCerere;

  private TipCerere tipCerere;

  private int repartizare;

  private String observatii;

  private String tipActivitate;

  private int reprezentantLegalId;

  private int userId;

  private LocalDateTime dateTransmission;

  private String neconformitati;

  private int solicitareCertificat;

  private long nrInregistrare;

  private int wvtaId;

  private TipCompletare tipCompletare;

  private int serviciutehnicId;

  private int customerId;

  public CereriClientiEntity(String certificatExtindere, int solicitareIncercari) {
    this.certificatExtindere = certificatExtindere;
    this.solicitareIncercari = solicitareIncercari;
  }


}
