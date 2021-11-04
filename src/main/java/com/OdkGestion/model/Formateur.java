package com.OdkGestion.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Formateurs")
public class Formateur extends Utilisateur{

}
