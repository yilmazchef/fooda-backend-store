package be.fooda.backend.store.model.create;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class AddressCreate {

    private UUID eAddressId;

    private String postcode;

    private String municipality;

    private String city;

}
