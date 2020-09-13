package com.rong.block.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "TACO_ORDER")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date placedAt;

    @ManyToMany(targetEntity = Taco.class)
    private List<Taco> tacos;

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }
    @PrePersist
    void placedAt() {
        this.placedAt = new Date();
    }

}
