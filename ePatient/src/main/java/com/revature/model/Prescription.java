package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "prescription")
public class Prescription
{
    @Id
    @Column(name = "prescriptionID")
    @GeneratedValue(generator = "prescription_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(allocationSize = 1, name = "prescription_id_seq", sequenceName = "prescription_id_seq")
    private int id;
    
    private Medication medication;
    
    private Person prescribedBy;
    
    private Person prescibedTo;
    
    @Column
    private int dosage;
    
}
