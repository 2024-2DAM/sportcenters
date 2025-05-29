package es.tiernogalvan.sportcenters.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class SportCenter {
    @Id
    private String name;
    private String owner;
    private Integer capacity;
    @OneToOne
    private Address address;
}
