package fr.novumligno.novumligno.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collaborator {

    public Collaborator() {

    }

    public Collaborator(String name, String function, String skill1, String skill2, String linkedin, String avatar) {
        this.name = name;
        this.function = function;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.linkedin = linkedin;
        this.avatar = avatar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;
    private String function;
    private String skill1;
    private String skill2;
    private String linkedin;
    private String avatar;


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the function
     */
    public String getFunction() {
        return function;
    }

    /**
     * @param function the function to set
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * @return String return the skill1
     */
    public String getSkill1() {
        return skill1;
    }

    /**
     * @param skill1 the skill1 to set
     */
    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    /**
     * @return String return the skill2
     */
    public String getSkill2() {
        return skill2;
    }

    /**
     * @param skill2 the skill2 to set
     */
    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    /**
     * @return String return the linkedin
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * @param linkedin the linkedin to set
     */
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * @return String return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}