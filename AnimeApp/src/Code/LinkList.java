/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author ThirukkumaranShanmug
 */
public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public void insertFirst(String name, String description, String picture) {
        Link newLink = new Link(name, description, picture);
        first = newLink;
    }

    public void insertLast(String name, String description, String picture) {
        Link newLink = new Link(name, description, picture);
        if (first == null) {
            first = newLink;
        } else {
            Link temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newLink);
        }
    }

    public Link find(String name) {
        Link temp = first;
        while (temp != null) {
            if (temp.getCharacterName().equals(name)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public Link delete(String name) {
        Link prev = null;
        Link temp = first;
        while (temp != null && !temp.getCharacterName().equals(name)) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null){
            return null;
        } 

        if (prev == null) {
            first = temp.getNext();
        } else {
            prev.setNext(temp.getNext());
        }
        return temp;
    }

    public Link getFirst() {
        return first;
    }

    public Link getNext(Link current) {
        if (current != null) {
            return current.getNext();
        }
        return null;
    }
    
    public void insertBefore(String targetName, String name, String description, String picture) {
    Link newLink = new Link(name, description, picture);

    if (first == null || first.getCharacterName().equals(targetName)) {
        insertFirst(name, description, picture);
    }

    Link prev = null;
    Link current = first;

    
    while (current != null && !current.getCharacterName().equals(targetName)) {
        prev = current;
        current = current.getNext();
    }
    if (current == null) {
        System.out.println("Target link not found.");
        return;
    }
    prev.setNext(newLink);
    newLink.setNext(current);
}

}

