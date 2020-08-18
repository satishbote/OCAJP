package org.examlabs.oca;

public class Q219Painting {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Q219Painting obj1 = new Q219Painting();
        Q219Painting obj2 = new Q219Painting();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + " : " + obj2.getType());
    }
}
