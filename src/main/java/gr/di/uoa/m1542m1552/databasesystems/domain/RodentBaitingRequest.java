package gr.di.uoa.m1542m1552.databasesystems.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rodent_baiting_request", schema="public")
public class RodentBaitingRequest extends Request {

    @Column(nullable = true)
    private int numberOfPremisesBaited;

    @Column(nullable = true)
    private int numberOfPremisesWithGarbage;

    @Column(nullable = true)
    private int numberOfPremisesWithRats;

    @Column(nullable = true)
    private String currentActivity;

    @Column(nullable = true)
    private String mostRecentAction;

    @Column(nullable = true)
    private int ssa;
}