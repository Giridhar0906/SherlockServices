package com.giridhar.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "sherlock_request", schema = "sherlock", uniqueConstraints = @UniqueConstraint(columnNames = "case_id"), indexes = {
		@Index(name = "idx_sher_req_lead_id", columnList = "lead_id, customer_id"),
		@Index(name = "idx_req_case_id", columnList = "case_id") })
public class SherlockRequest extends AuditStamp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "lead_id")
	private String leadId;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "case_id")
	private String caseId;

	//@JdbcTypeCode(SqlTypes.JSON)
	@Column(name = "raw_json", columnDefinition = "json")
	private String rawJSON;

	@Column(name = "sherlock_request_data", columnDefinition = "text")
	private String sherlockRequestData;

	@Column(name = "acknowledgement_xml", columnDefinition = "text")
	private String acknowledgementXML;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "sherlockRequest", orphanRemoval = true)
	@JsonBackReference
	private SherlockResponse sherlockResponse;

}