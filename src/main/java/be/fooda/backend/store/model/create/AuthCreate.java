package be.fooda.backend.store.model.create;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AuthCreate {

    private String authKey;

    private String secret;

    private LocalDate expiryDate;

    private String siteUrl;

    private String storeUrl;

}
