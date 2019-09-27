package marph.marphproject.entity;

import marph.marphproject.entity.User;

import javax.persistence.*;


/**
 * The persistent class for the Driver database table.
 *
 */
@Entity
@Table(name = "passenger")
@DiscriminatorValue(value = User.PASSENGER)
public class Passenger extends User  {

}