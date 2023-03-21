package com.ads.Investigationintranet.domain.trial;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ig_trial_therapeutic_subclass_for_drugs")
public class TherapeuticSubClassForDrugs  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hhhId")
    @JsonProperty
    private long hhhId;

    @Column(name = "code")
    private String code;

    @Column(name = "nameFr")
    private String nameFr;

    @Column(name = "nameEn")
    private String nameEn;

    @Column(name = "selected")
    private Boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "therapeuticClassForDrugsHhhId", referencedColumnName = "hhhId")
    @JsonIgnore
    private TherapeuticClassForDrugs therapeuticClassForDrugs;

}
