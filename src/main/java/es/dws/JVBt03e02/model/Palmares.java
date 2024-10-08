package es.dws.JVBt03e02.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Palmares {

    @Digits(integer = 4, fraction = 0)
    private Integer year;

    @NotBlank
    private String award;

    @NotBlank
    private String note;

}
