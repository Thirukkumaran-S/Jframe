/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author ThirukkumaranShanmug
 */
public class Link {
    public String characterName;
    private String description;
    private String picture;
    public Link next;

    public Link(String characterName, String description, String picture) {
        this.characterName = characterName;
        this.description = description;
        this.picture = picture;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public Link getNext() {
        return next;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setNext(Link next) {
        this.next = next;
    }
    
    

    
}
