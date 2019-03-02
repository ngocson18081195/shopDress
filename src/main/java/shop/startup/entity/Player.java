package shop.startup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Create by ngocson on 23/02/2019
 */
@Entity
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
