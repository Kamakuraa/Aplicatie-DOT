package ro.rarom.aplicatiedot.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "dot_cereri_clienti")
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OmologariEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private int beneficiarId;

  private String certificatExtindere;

  private int solicitareIncercari;

  private String tipOmologari;

  private String metodaPlata;

  private StareCerere stareCerere;

  private int dosarId;

  private LocalDateTime dataCerere;

  private int tipCerere;

  private int repartizare;

  private String observatii;

  private String tipActivitate;

  private int reprezentantLegalId;

  private int userId;

  private LocalDateTime dateTransmission;

  private String neconformitati;

  private int solicitareCertificat;

  private int nrInregistrare;

  private String wvta;

  private int wvtaId;

  private TipComplementare tipCompletare;

  private int serviciutehnicId;

  private int customerId;

  public OmologariEntity(String certificatExtindere, int solicitareIncercari) {
    this.certificatExtindere = certificatExtindere;
    this.solicitareIncercari = solicitareIncercari;
  }

}
