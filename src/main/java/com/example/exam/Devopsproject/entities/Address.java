

import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "Address")
@Table(name = "addresses")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String city;
    private int zipcode;

    public Address() {
    }

    public Address(String street, int zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}