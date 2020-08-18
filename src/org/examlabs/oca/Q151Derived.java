package org.examlabs.oca;


    class Bases {
        private int num;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

    }

    public class Q151Derived extends Bases {
        public static void main(String[] args) {
            Q151Derived obj = new Q151Derived();
            obj.setNum(3);
            System.out.println("Square = " + obj.getNum() * obj.getNum());
        }
    }

