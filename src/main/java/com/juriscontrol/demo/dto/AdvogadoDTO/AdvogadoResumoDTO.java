package com.juriscontrol.demo.dto.AdvogadoDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdvogadoResumoDTO {
    
    private Long id;
    private String nome;
    private String registroOAB;

}
