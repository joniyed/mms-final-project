package io.swagger.model;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;import javax.persistence.Column;import javax.persistence.Embeddable;@Embeddable@Data@AllArgsConstructor@NoArgsConstructorpublic class Name {    @Column(name = "firstName",length = 50,nullable = false)    private String firstName;    @Column(name = "lastName",length = 50,nullable = false)    private String lastName;}