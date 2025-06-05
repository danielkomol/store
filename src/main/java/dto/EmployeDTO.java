package dto;

         import lombok.AllArgsConstructor;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import model.nomPoste;

         import java.time.LocalDate;
 import java.util.UUID;

         public record EmployeDTO(
 UUID id,
 String nom,
 String email,
 Integer anciennete,
 Integer salaire,
 nomPoste poste,
 String departement
 ) {
 }