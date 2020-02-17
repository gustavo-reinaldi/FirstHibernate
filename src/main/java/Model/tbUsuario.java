/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.id.CompositeNestedGeneratedValueGenerator;

/**
 *
 * @author gustavodev
 */
@Entity
public class tbUsuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;    
    private int nome;
    private String senha;
    
}
