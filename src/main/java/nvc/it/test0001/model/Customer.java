package nvc.it.test0001.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; 
    private String gender;

    @ManyToOne
    @JoinColumn(name = "bookId", nullable = false)
    private Book book;


    //ให้เพิ่ม ที่มีการเก็บเป็นเวลาข้อมูล
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createAt;

}
