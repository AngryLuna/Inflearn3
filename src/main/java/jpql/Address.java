package jpql;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String city;

    private String street;

    @Column(name = "zip_code")
    private String zipCode;

    @Override
    public String toString() {
        return String.format("%s, %s (%s)", this.street, this.city, this.zipCode);
    }
}
