package marph.marphproject.entity;


import lombok.*;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 *
 */
@Entity

@Table(name = "user", schema = "public")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn( name = "DTYPE", columnDefinition = "int", discriminatorType = DiscriminatorType.INTEGER)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    public static final String DRIVER = "1";
    public static final String PASSENGER = "1";

    @Id
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    private Boolean active;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;



}