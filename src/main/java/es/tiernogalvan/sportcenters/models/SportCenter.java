package es.tiernogalvan.sportcenters.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class SportCenter {
    @Id
    private String name;
    private String owner;
    private Integer capacity;
    @OneToMany(mappedBy = "sportCenter")
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        addresses.add(address);
        address.setSportCenter(this);
    }
}
