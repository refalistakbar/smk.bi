package com.smk.bi.ticketing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama Akbar Refalista
// NIS 161010160
@Entity
@Table (name ="Rails")
public class Rails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long railsId;
    private String railsName;
    private Long capacity;
}
