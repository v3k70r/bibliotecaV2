package model;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    @Id
    private Integer id;

    @Column(unique = true, length = 9)
    private String run;

    @NotBlank
    private String nombres;

    @Email
    private String correo;

    private String jornada;

    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "codigo_carrera")
    private Carrera carrera;
}

