package Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name ="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=3,max=30,message ="No cumple con la longitud")
    private String nombre;

    @NotBlank
    @Size(min=3,max=30,message ="No cumple con la longitud")
    private String apellido;

    @Size(min=1,max=100,message ="No cumple con la longitud")
    private String img;
} 
