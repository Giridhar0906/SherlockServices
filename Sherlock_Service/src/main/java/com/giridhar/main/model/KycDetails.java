package com.giridhar.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "id_data", schema = "sherlock")
public class KycDetails extends AuditStamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "voter_id")
    private String voterId;

    @Column(name = "uid")
    private String uid;

    @Column(name = "ration_card_number")
    private String rationCardNumber;

    @Column(name = "driving_license_number")
    private String drivingLicenseNumber;

    @Column(name = "pan")
    private String pan;

    @Column(name = "nrega_card_number")
    private String nregaCardNumber;

    @Column(name = "ckyc")
    private String ckyc;

    @Column(name = "other")
    private String other;

    @OneToOne
    @JoinColumn(name = "sherlock_request_fk")
    @JsonBackReference
    private SherlockRequest sherlockRequest;
}
