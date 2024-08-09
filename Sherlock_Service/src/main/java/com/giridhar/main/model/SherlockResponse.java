package com.giridhar.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "sherlock_response", schema = "sherlock", indexes = {
		@Index(name = "idx_sher_res_lead_id", columnList = "lead_id, customer_id"),
		@Index(name = "idx_res_case_id", columnList = "case_id")})

public class SherlockResponse extends AuditStamp{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lead_id")
    private String leadId;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "xml_report", columnDefinition = "text")
    private String xmlReport;

    @Column(name = "html_report", columnDefinition = "text")
    private String htmlReport;

    @Column(name = "status")
    private String status;

    @Column(name = "score")
    private String score;

    @OneToOne
    @JoinColumn(name = "case_id", referencedColumnName = "case_id", nullable = false)
    private SherlockRequest sherlockRequest;


}
